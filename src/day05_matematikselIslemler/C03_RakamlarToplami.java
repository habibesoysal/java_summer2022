package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {

        // Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tam sayı giriniz");
        int sayi = scan.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = sayi;

        birlerBasamagi = sayi % 10; // 7
        rakamlarToplami += birlerBasamagi; // 7
        sayi /= 10;

        birlerBasamagi = sayi % 10; // 6
        rakamlarToplami += birlerBasamagi; // 7+6=13
        sayi /= 10;

        birlerBasamagi = sayi % 10; // 2
        rakamlarToplami += birlerBasamagi; // 13+2=15
        sayi /= 10;

        birlerBasamagi = sayi % 10; // 5
        rakamlarToplami += birlerBasamagi; // 15+2=20
        sayi /= 10;

        System.out.println(ilkGirilenSayi +  " sayısının rakamlar toplamı : " + rakamlarToplami);


    }
}
