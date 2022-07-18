package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /*
        kullanıcıdan iki sayı alıp
        bu sayıların çarpımını yazıdırın
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı girin");

        double sayi1= scan.nextDouble();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        double sayi2= scan.nextDouble();

        System.out.println("Girilen sayıların çarpımı: " + sayi1*sayi2);




    }
}
