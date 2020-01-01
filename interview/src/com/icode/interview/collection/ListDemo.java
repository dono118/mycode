package com.icode.interview.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合的四种遍历方式
 *
 * @author Unicorn
 */
public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C/C++");
        list.add("Python");
        list.add("Golang");
        list.add("PHP");

        //1.使用foreach遍历list
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("===================================");

        // forEach的Lambda表达式实现
        list.forEach(System.out::println);

        System.out.println("===================================");

        //2.使用一般型for循环遍历
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
            if ("PHP".equals(list.get(i))) {
                list.remove(list.get(i));
            }
        }

        System.out.println("===================================");

        //3.把链表变成数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        System.out.println("===================================");

        //4.使用迭代器进行相关遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
