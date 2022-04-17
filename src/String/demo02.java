package String;

public class demo02 {
    public static void main(String[] args) {
        String str = "nasjkndf;snvksvn;slvnsfjk;v";
        System.out.println(str.length());
        String str3 = str.concat("abasddc");
        System.out.println(str3);
        System.out.println(str3.charAt(5));
        System.out.println(str.indexOf("j"));
    }
}
