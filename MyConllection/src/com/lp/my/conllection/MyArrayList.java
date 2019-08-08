package com.lp.my.conllection;

import java.util.*;

/**
 * @author 000
 * @date 2019/8/2
 */
public class MyArrayList {
    public static void main(String[] args) {
        // 初始容量
        List<Integer> list = new ArrayList<>(50);

        list = Collections.synchronizedList(list);
        // 最大容量 list.ensureCapacity(100);

        int cap = 50;
        for (int i = 0; i < cap; i++) {
            int ran = new Random().nextInt(100);
            list.add(1);
        }
        list.add(97);
        System.out.println(list);
        // 去重
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);


    }


}
