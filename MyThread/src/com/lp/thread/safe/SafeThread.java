package com.lp.thread.safe;

import com.lp.thread.safe.MaxNum;

/**
 * @author 000
 * @date 2019/8/1
 */
public class SafeThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            MaxNum maxNum = new MaxNum();

            @Override
            public void run() {
                maxNum.getCount();
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

    }


}
