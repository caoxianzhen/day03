package com.xja.www.test;

public class GetNum {
    public static void main(String[] args) {


        int[] arr1 = add2(10, 29);
        System.out.println(arr1[1]);
        System.out.println(arr1[0]);

    }

    public static int[] add2(int a, int b) {
        int sum = a + b;
        int svg = sum / 2;
        int[] arr = {sum, svg};
        return arr;
    }
}
