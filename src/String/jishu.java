package String;

import java.util.Scanner;

public class jishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            char ch = arr[i];
            System.out.println(arr[i]);

        }
    }
}
