package com.lp.thread;

/**
 * @author 000
 * @date 2019/8/1
 */
public class SingleThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("单例线程");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(t.getName() + "正在执行的线程" + i);
                if (i == 5) {
                    return;
                }
            } catch (Exception e) {
                System.out.println("线程出现错误");
            }
        }
    }

}
