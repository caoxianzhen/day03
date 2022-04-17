package com.xja.www.test;

import java.util.Arrays;

public class Demotochar {
    public static void main(String[] args) {
        String str = "jndsljvksnjvnskljbvsvbjsvsf";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.println();

        }

    }
}
