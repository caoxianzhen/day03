package com.xja.www.test;

import java.util.Random;

public class Rodem {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 1000; i++) {


            Random rc = new Random();
            int num = rc.nextInt(10);
            int num2 = rc.nextInt(10);
            int num3 = rc.nextInt(10);
            if (num2 == num && num3 == num2) {
                count++;
                System.out.println("这个数是" + num + "第" + i + "次" + "出现了" + count + "次");

            }
        }
    }

}
