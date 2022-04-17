package String;

public class Split {
    public static void main(String[] args) {
        String str = "jcan,dfk,lns,ldc,nsl,dn";
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


    }
}
