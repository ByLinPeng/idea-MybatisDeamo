package com.lp.foun;

/**
 * @author 000
 * @date 2019/8/5
 */
public class StaticTest {
    private  void testMethod(){
        System.out.println("A方法输出");
    }

    public static void main(String[] args) {
//        ((StaticTest)null).testMethod();
        StaticTest t = null;
        t.testMethod();
    }
}
