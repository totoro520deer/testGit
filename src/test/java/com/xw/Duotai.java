package com.xw;

import java.util.ArrayList;
import java.util.List;

public class Duotai {
    public static void main(String[] args) {
        A a =new A();
        a.setName("你爸爸");
        B b=new B();
        b.setName("你儿子");
        b.setAge(20);
        List<A> list = new ArrayList<>();
        list.add(b);
        B b1 = (B) list.get(0);
        System.out.println( b1.getAge());

    }
    public static void print(A a){
        System.out.println(a.getName());//你儿子
        System.out.println(((B)a).getAge());//20
    }
}
