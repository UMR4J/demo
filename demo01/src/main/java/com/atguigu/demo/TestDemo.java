package com.atguigu.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zdy
 * @create 2019-07-09 21:19
 */
public class TestDemo {

    public static void main(String[] args) {
//        System.out.println("abc");
//        System.out.println("abc");
//        ArrayList list = new ArrayList();
//        long maxMemory = Runtime.getRuntime().maxMemory();
//        long totalMemory = Runtime.getRuntime().totalMemory();
//
//        System.out.println("maxMemory:"+maxMemory/(double)1024/1024+"M");
//        System.out.println("totalMemory:"+totalMemory/(double)1024/1024+"M");
        //test OOM OutOfMemoryError java heap space
        String str="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        while(true){
            str+=str+new Random().nextInt(88888888) + new Random().nextInt(999999999) ;
            //123

        }
    }
}
