package com.lp.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 000
 * @date 2019/8/1
 */
public class MyScheduledThreadPool2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                System.out.println("延迟一秒后每3秒执行");
                System.out.println(System.currentTimeMillis());
            }
        }, 1, 3, TimeUnit.SECONDS);

    }
}
