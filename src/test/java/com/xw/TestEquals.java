package com.xw;

public class TestEquals {
    public static void main(String[] args) {
        Integer a = 188;
        Long b =188L;
        System.out.println(b==188);
        String c = "aaa";
        String d = null;
        String e = c+d;
        System.out.println(e);
//        StringBuilder sb = new StringBuilder();
//        String recAddress = sb.toString();
//        System.out.println(recAddress);
    }
}
