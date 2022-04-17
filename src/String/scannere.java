package String;

import java.util.Scanner;

public class scannere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int s = sc.nextInt();

        System.out.println("请输入一个数字");
        int s1 = sc.nextInt();

        System.out.println("请输入一个数字");
        int s2 = sc.nextInt();

        int temp = s > s1 ? s : s1;
        int max = temp > s2 ? temp : s2;
        System.out.println(max);

    }
}
