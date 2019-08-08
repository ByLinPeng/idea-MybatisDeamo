package com.lp.my.conllection;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author 000
 * @date 2019/8/2
 */
public class MyHashtable {
    public static void main(String[] args) {
        int num = 10;
        Hashtable<Object, Object> table = new Hashtable<>();
        for (int i = 0; i < num; i++) {
            table.put(i, "序号" + i);
        }
        table.put("i",88);
        for (Map.Entry<Object, Object> entry : table.entrySet()) {
            System.out.println("key: " + entry.getKey() +"-----"+"value: " + entry.getValue());
        }

    }

}
