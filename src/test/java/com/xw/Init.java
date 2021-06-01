package com.xw;

public class Init {
    public static void main(String[] args) {
        A1 a= new A1();
        System.out.println(A1.m);
    }
}


class A1{
    static {
        System.out.println("A类静态方法执行");
        m=300;
    }
    static int m=100;
    public A1 (){
        System.out.println("A类构造方法执行");
    }
}