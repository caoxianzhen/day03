package com.xja.www;

public class ArrayDemo {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abc";
        char[] charsa = {'a', 'b', 'c'};
        String str3 = new String(charsa);
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str2 == str3);
    }
}
