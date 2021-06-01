package com.xw;

/**
 * @Description:
 * @author: XiongWei
 * @date 2021/5/9
 */
public class Test2 {

    public static void main(String[] args) {
        String a = new String("abc");
        System.out.println(a);
        String b=a;
         a = "abcd";
        System.out.println(a);
        System.out.println(b);

    }
}
