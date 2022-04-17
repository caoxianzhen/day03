package com.xja.www;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello2";
        char[] arr = {23, 45, 6, 754, 3};
        String str5 = null;
        String str3 = new String(arr);
//        System.out.println(str5.equals(str3));
        System.out.println(str.equalsIgnoreCase(str2));


    }
}
