package com.lp.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 缓存线程池,执行完一个任务后,下一个任务还是这个
 * 的话,就从缓存中取之前创建的那个线程
 *
 * @author 000
 * @date 2019/8/1
 */
public class MyCacheThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "---" + "正在被执行");
                }
            });
        }
    }
}
