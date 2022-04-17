package com.xja.www.test;

import java.util.ArrayList;

public class Demo_Array {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("lisi5");
        list.add("lisi56");
        list.add("lisi567");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
