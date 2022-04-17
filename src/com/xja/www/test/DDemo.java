package com.xja.www.test;

import java.util.Arrays;

public class DDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 34, 21, 12, 39};
        String str = Arrays.toString(arr);
        System.out.println(str);
        Arrays.sort(arr);
        System.out.println(arr[1]);

    }
}
