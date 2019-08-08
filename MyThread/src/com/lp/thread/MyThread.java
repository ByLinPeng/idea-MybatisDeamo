package com.lp.thread;

/**
 * @author 000
 * @date 2019/8/1
 */
public class MyThread extends Thread {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("MyThread.run()");
    }

}
