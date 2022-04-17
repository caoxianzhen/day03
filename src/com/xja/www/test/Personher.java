package com.xja.www.test;

import com.xja.www.Person;

public class Personher {
    public static void main(String[] args) {
        Person[] arr = new Person[5];
        Person one = new Person("张三", 23);
        Person two = new Person("李四", 24);
        arr[0] = one;
        arr[1] = two;

        System.out.println(arr[0]);
        System.out.println(arr[0].getName());
    }
}