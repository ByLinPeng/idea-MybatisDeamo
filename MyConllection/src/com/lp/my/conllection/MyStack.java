package com.lp.my.conllection;

import java.util.Random;
import java.util.Stack;

/**
 * @author 000
 * @date 2019/8/2
 */
public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            int ran = new Random().nextInt(50);
            stack.push(ran);
            System.out.print(stack);
        }
        System.out.println(stack);
        Integer first = stack.pop();
        System.out.println(first);
    }
}
