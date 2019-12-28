package com.icode.interview.socket;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Unicorn
 * @create 2019-10-03 22:56
 */
public class TraditionalSocketDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("服务端启动, 端口为: 7777");
        while (true) {// 循环监听是否有客户端连接
            // 获取socket套接字
            Socket socket = serverSocket.accept();
            System.out.println("有新的客户端连接上来了...");

            // 业务处理
            new Thread(() -> {
                try{
                    // 获取客户端输入流
                    InputStream is = socket.getInputStream();
                    byte[] b = new byte[1024];
                    while (true) {// 循环读取数据
                        int data = is.read(b);
                        if (data != -1) {
                            String info = new String(b, 0, data, "GBK");
                            System.out.println(info);
                        } else {
                            break;
                        }
                    }
                }catch (Exception e) {
                }
            }).start();
        }
    }
}
