package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Güzeldir";
        int sayi1 = 5;
        int sayi2 = 4;

        System.out.println(str1 + " " + str2 + " " + sayi1 + sayi2); // Java Güzeldir 54

        System.out.println(str1 + " " + str2 + " " + (sayi1 + sayi2)); // Java Güzeldir 9

        System.out.println((sayi1 + sayi2) + " " + str1); // 9 Java

        System.out.println("" + sayi1 + sayi2 + " " + str2); // 54 Güzeldir
    }
}
