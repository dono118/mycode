package com.icode.interview.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的四种遍历方式
 *
 * @author Unicorn
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jack", 18);
        map.put("Cindy", 20);
        map.put("George", 35);
        map.put("Ellen", 22);

        // JDK1.4中
        // 遍历方法一 HashMap entrySet() 遍历
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key=" + key + " value=" + value);
        }

        System.out.println("===================================");

        // JDK1.5中,应用新特性For-Each循环
        // 遍历方法二
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key=" + key + " value=" + value);
        }

        System.out.println("===================================");

        // 遍历方法三 HashMap keySet() 遍历
        for (Iterator iter = map.keySet().iterator(); iter.hasNext();) {
            String key = (String) iter.next();
            Integer value = map.get(key);
            System.out.println("key=" + key + " value=" + value);
        }

        System.out.println("===================================");
        // 遍历方法四 foreach 遍历
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("key=" + key + " value=" + value);
        }
    }
}
