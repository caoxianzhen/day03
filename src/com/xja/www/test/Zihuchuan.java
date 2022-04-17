package com.xja.www.test;

public class Zihuchuan {
    public static void main(String[] args) {


        String str = "a,bf,vf,cfccx,xdx,xdx";
////        str.toCharArray();
        String num = str.valueOf(23);
        System.out.println(num);
        

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println(str.toCharArray());
//        System.out.println(str.getBytes());
//      i
    }

}
