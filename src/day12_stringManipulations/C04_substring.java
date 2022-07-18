package day12_stringManipulations;

public class C04_substring {
    public static void main(String[] args) {

        String str = "Java çok yaşa";

        System.out.println(str.substring(3,4)); // a

        System.out.println(str.substring(5,7)); // ço

        System.out.println(str.substring(6,6)); // hiçlik

        // System.out.println(str.substring(6,2)); // exception

    }
}
