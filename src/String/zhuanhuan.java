package String;

public class zhuanhuan {
    public static void main(String[] args) {
        String str = "msmaldmnflkskdd";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println(arr[1]);
        System.out.println(arr.length);
        byte[] nnn = str.getBytes();
        for (int i = 0; i < nnn.length; i++) {
            System.out.println(nnn[i]);
        }

        String str3 = "how do you do ";
        String str1 = str.replace("o", "*");
        System.out.println(str1);


    }
}
