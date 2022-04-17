package com.xja.www.test;

public class isSame {
    public static void main(String[] args) {
//        isSame1(4,5);
        System.out.println(isSame1(4, 5));

    }

    public static boolean isSame1(int a, int b) {
        boolean tem;
        if (a == b) {
            tem = true;
        } else {
            tem = false;
        }
        return tem;

    }

    public static boolean isSame1(byte a, byte b) {
        if (a == b) {
            return true;

        } else {
            return false;
        }

    }

    public static boolean isSame1(short a, short b) {
        boolean mm = a == b ? true : false;
        return mm;
    }

    int[] arr = {2, 3, 4, 5, 4, 3};
    int[] arr1 = new int[200];

}
