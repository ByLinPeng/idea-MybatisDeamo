package com.lp.thread.safe;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 使用阻塞队列实现线程同步
 *
 * @author 000
 * @date 2019/8/1
 */
public class Safe {
    /**
     * 定义一个阻塞队列用来储存生产出来的商品
     */
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
    /**
     * 定义生产商品个数
     */
    private static final int SIZE = 10;

    /**
     * 定义启动线程的标志，为0时，启动生产商品的线程；为1时，启动消费商品的线程
     */
    private int flag = 0;

    private class LinBlockThread implements Runnable {
        @Override
        public void run() {
            int new_flag = flag++;
            System.out.println("启动线程" + new_flag);
            if (new_flag == 0) {
                for (int i = 0; i < SIZE; i++) {
                    int b = new Random().nextInt(100);
                    System.out.println("生产商品数量" + b + "号");
                    try {
                        queue.put(b);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("仓库中商品还有" + queue.size() + "个");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                for (int i = 0; i < SIZE / 2; i++) {
                    try {
                        int n = queue.take();
                        System.out.println("消费者买去了" + n + "号商品");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("仓库还剩商品" + queue.size() + "个");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Safe safe = new Safe();
        LinBlockThread linBlockThread = safe.new LinBlockThread();
        Thread thread1 = new Thread(linBlockThread);
        Thread thread2 = new Thread(linBlockThread);
        thread1.start();
        thread2.start();
    }

}
