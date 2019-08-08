package com.lp.my.conllection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 000
 * @date 2019/8/2
 */
public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(16);
        map = Collections.synchronizedMap(map);
        int size = 1;
        map.put(232, "!");
        map.put(null, "2fdd");
        while (size < 10) {
            map.put(size, "序号" + size);
            size++;
        }
        map.put(244, "?");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + "----" + "value: " + entry.getValue());
        }
    }
}
