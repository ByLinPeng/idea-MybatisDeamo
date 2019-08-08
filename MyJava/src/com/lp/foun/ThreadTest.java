package com.lp.foun;

/**
 * @author 000
 * @date 2019/8/5
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("---run()---");
            }
        });
        System.out.println("---线程111一----");
//        thread.run();
        thread.start();
        System.out.println("----线程222---");

    }
}
