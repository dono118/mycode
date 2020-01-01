package com.icode.interview.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set集合的三种遍历方式
 *
 * @author Unicorn
 */
public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hadoop");
        set.add("hive");
        set.add("hbase");
        set.add("yarn");
        set.add("mapreduce");
        set.add("zookeeper");
        set.add("spark");

        //1.迭代器遍历
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println();

        //2.增强for循环遍历
        for (String str : set) {
            System.out.println(str);
        }

        System.out.println();

        //3.可以泛型为Object,同样是foreach遍历，输出的时候需要instanceof一下类型
        Set<Object> set2 = new HashSet<>();
        set2.add(111);
        set2.add(222);
        set2.add("aaa");
        for (Object obj : set2) {
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println(str);
            } else if (obj instanceof Integer) {
                Integer val = (Integer) obj;
                System.out.println(val);
            }
        }
    }
}
