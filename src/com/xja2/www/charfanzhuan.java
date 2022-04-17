package com.xja2.www;

public class charfanzhuan {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        fanzhuan(arr);
        priint(arr);


    }

    public static void fanzhuan(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
    }

    public static void priint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}

