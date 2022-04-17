package com.xja.www;

public class DemoArray {
    public static void main(String[] args) {
        String str = new String();
        System.out.println(str);
        byte[] array = {97, 98, 99};
        String str1 = new String(array);
        System.out.println(str1);

        char[] arr1 = {'a', 'd', 'd'};
        String str2 = new String(arr1);
        System.out.println(str2);
    }
}
