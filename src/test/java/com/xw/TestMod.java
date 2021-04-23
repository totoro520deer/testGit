package com.xw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.EventListener;

@RunWith(JUnit4.class)
public class TestMod {
    @Test
    public void test(){
        int a =15 ;
        int b =16;
        int i = Math.floorMod(a, b);
        int c =a%b;
        System.out.println(c);
        System.out.println(i);

    }
}
