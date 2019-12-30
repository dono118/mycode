package com.icode.interview.thread;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 1.故障现象
 *      java.util.ConcurrentModificationException (并发修改异常)
 * 2.产生原因
 *      并发修改导致迭代器的modCount和expectedModCount的值不一致
 * 3.解决方案
 *      3.1 new Vector<>();
 *      3.2 Collections.synchronizedList(new ArrayList<>());
 *      3.3 new CopyOnWriteArrayList<>();
 * 4.优化建议
 *      多线程: 推荐使用CopyOnWriteArrayList, ConcurrentHasMap等
 *
 * @author Unicorn
 */
public class UnSafeCollectionDemo {

    public static void main(String[] args) {
        // 单线程情况下
//        List<String> list = Arrays.asList("a", "b", "c");
//        list.forEach(System.out::println);

        // 多线程情况下
//        List<String> list = new ArrayList<>(); //会报错:java.util.ConcurrentModificationException
//        List<String> list = new Vector<>();
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList<>();

        for (int i = 1; i <= 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(Thread.currentThread().getName() + "\t" + list);
            }, String.valueOf(i)).start();
        }

    }
}
