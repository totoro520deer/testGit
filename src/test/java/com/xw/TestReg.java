package com.xw;

import java.util.Scanner;

public class TestReg {
    public static void main(String[] args) {
        String PHONE_NUMBER_REG = "^(1[3-9])\\d{9}$";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String phone = sc.next();
      boolean flag= phone.matches(PHONE_NUMBER_REG);
        System.out.println(flag);

    }
}
