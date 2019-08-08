package com.lp.myrunnable;

/**
 * @author 000
 * @date 2018/8/1
 */
public class MyRunnable implements Runnable{
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }


    @Override
    public void run() {
        System.out.println("MyRunnable.run()");
    }
}
