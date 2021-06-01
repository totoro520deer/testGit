package com.xw;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getTime());
        long time =date.getTime()-30*24*60*60*1000;//(2592000000)
        //int（-2147483648~2147483647）超出范围后会变成负数
        System.out.println(30*24*60*60*1000);
        System.out.println(time);
        System.out.println(time-date.getTime());
    }
}
