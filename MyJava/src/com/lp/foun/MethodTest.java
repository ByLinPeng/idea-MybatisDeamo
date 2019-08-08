package com.lp.foun;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 000
 * @date 2019/8/5
 */
public class MethodTest extends  Object{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
            list.remove(integer);
        }
    }
    public void getStr(int a,String ...string){

    }
    public void getStr2(String ...strings){

    }

}
