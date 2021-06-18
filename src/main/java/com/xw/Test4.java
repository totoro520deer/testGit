package com.xw;

import java.util.Random;
import java.util.UUID;

/**
 * @Description:
 * @author: XiongWei
 * @date 2021/6/1
 */
public class Test4 {
    private int id = 10;

    private String name = "hhl";

    public static void main(String[] args) {
        Random random = new Random();
        int end = random.nextInt(999);
        //如果不足三位前面补0
        String endStr1 =String.format("%03d", end);
        String str =UUID.randomUUID().toString().replace("-", "")+ endStr1;
        System.out.println(str);
    }

}
