package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve başarılı şifre girinceye kadar tekrar şifre girmesini isteyin.
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;

        while (!sifreBasariliMi) {
            // Kullanıcıdan bir şifre alalım
            System.out.println("Lütfen bir şifre giriniz");
            sifre = scan.nextLine();
            // 4 kontrolü yapalım, her geçen kontrol için kontrol variable'ını 1 artıralım.

            // ilk harf kontroliü
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("İlk harf büyük harf olmalı");
            }

            // son harf kontrolü
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf küçük harf olmalı");
            }
            // boşluk kontrolü
            if (sifre.contains(" ")) {
                System.out.println("Şifre boşluk içermemeli");
            } else {
                kontrol++;
            }

            // şifre uzunluk kontrolü
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Şifre en az 8 karakterli olmalı");
            }

            if (kontrol == 4) { // tüm kontrollerden geçmiş demektir.
                System.out.println("Şifre başarı ile tanımlandı");
                sifreBasariliMi = true;
            } else {  // Şifre başarısız
                // tekrar başa dönecek
                // kontrol variable'ı sıfırlanmalı
                kontrol = 0;
            }
        }
    }
}