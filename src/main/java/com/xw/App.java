package com.xw;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }
        long time1 = System.currentTimeMillis();
        for (Integer a: list1) {
            for (Integer b:list2){
                if (a==b){
                    list3.add(a);
                    break;
                }
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        System.out.println(list3);

        long time3 = System.currentTimeMillis();
        List<Integer> list4= list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
        long time4 = System.currentTimeMillis();
        System.out.println(time4-time3);
        System.out.println(list4);


    }
}
