package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin.
        // Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi = scan.nextDouble();

        // Eğer ternary içindeki sonuçlar farklı data türlerine aitse atama yapamayız,
        // sadece yazdırabiliriz.

        System.out.println(sayi > 0 ? "Sayı pozitif" : (sayi*sayi));
    }
}
