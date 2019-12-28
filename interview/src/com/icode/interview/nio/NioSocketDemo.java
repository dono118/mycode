package com.icode.interview.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * @author Unicorn
 * @create 2019-10-04 9:40
 */
public class NioSocketDemo {
    // 通道管理器(选择器), 多个用户共用的, 所以需要放在这里
    private Selector selector;

    /**
     * 初始化服务端通道, 并初始化选择器
     * 获得一个通道, 并对通道做一些初始化工作
     *
     * @param port 服务端端口
     * @throws IOException 抛出异常
     */
    public void initServer(int port) throws IOException {
        // 获取ServerSocket通道, 相当于传统的ServerSocket
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        // 设置通道为非阻塞
        serverChannel.configureBlocking(false);
        // 将通道对应的ServerSocket绑定到port端口
        serverChannel.socket().bind(new InetSocketAddress(port));
        // 获得一个通道选择器(管理器)
        this.selector = Selector.open();
        // 将通道选择器和该通道绑定, 并为该通道注册SelectionKey.OP_ACCEPT事件
        serverChannel.register(this.selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务端启动成功...");
    }

    /**
     * 采用轮询的方式监听Selector上是否有需要处理的事件, 如果有则进行处理
     * @throws IOException 抛出异常
     */
    public void listenSelector() throws IOException {
        while (true) {
            this.selector.select();
            Iterator<SelectionKey> keyIterator = this.selector.selectedKeys().iterator();
            while (keyIterator.hasNext()) {
                SelectionKey selectionKey = keyIterator.next();
                // 删除已选的key, 以防重复处理
                keyIterator.remove();
                // 处理请求
                handler(selectionKey);
            }
        }
    }

    /**
     * 处理请求
     * @param selectionKey 事件集合
     */
    private void handler(SelectionKey selectionKey) throws IOException {
        if (selectionKey.isAcceptable()) {
            System.out.println("新的客户端连接...");
            ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
            SocketChannel socketChannel = server.accept();
            socketChannel.configureBlocking(false);
            socketChannel.register(this.selector, SelectionKey.OP_READ);
        } else if (selectionKey.isReadable()) {
            SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int readData = socketChannel.read(buffer);
            if (readData > 0) {
                String msg = new String(buffer.array(), "GBK").trim();
                System.out.println("服务端收到的消息: " + msg);

                ByteBuffer writeBackBuffer = ByteBuffer.wrap("receive data".getBytes("GBK"));
                socketChannel.write(writeBackBuffer);
            } else {
                System.out.println("客户端关闭咯...");
                selectionKey.cancel();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        NioSocketDemo server = new NioSocketDemo();
        server.initServer(8888);
        server.listenSelector();
    }
}
