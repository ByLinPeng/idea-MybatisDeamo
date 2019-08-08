package com.lp.thread.safe;

/**
 * @author 000
 * @date 2019/8/1
 */
public class MaxNum {

    int maxNum = 0;

    public void getCount() {
        for (int i = 0; i <= 10; i++) {
            maxNum += i;
        }
        System.out.println(Thread.currentThread().getName() + "--" + maxNum);
    }
}
