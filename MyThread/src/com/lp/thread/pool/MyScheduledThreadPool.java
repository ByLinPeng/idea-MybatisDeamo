package com.lp.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 创建一个定长线程池，支持定时及周期性任务执行
 * @author 000
 * @date 2019/8/1
 */
public class MyScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟一秒执行");
            }
        },1, TimeUnit.SECONDS);

    }
}
