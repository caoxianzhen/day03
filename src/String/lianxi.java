package String;

public class lianxi {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "world" + "]";
            } else {
                str += "world" + arr[i] + "#";
            }
        }
        System.out.println(str);
    }
}