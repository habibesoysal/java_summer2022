package day13_methodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String sifre = scan.next();
        int kontrol = 0;

        // ilk harf kontroliü
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z'){
            kontrol++;
        } else {
            System.out.println("İlk harf büyük harf olmalı");
        }

        // son harf kontrolü
        if (sifre.charAt(sifre.length()-1) >= 'a' && sifre.charAt(sifre.length()-1) <= 'z'){
            kontrol++;
        } else {System.out.println("Son harf küçük harf olmalı");
        }
        // boşluk kontrolü
        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içermemeli");
        } else {
            kontrol++;
        }

        // şifre uzunluk kontrolü
        if (sifre.length()>=8) {
            kontrol++;
        } else {
            System.out.println("Şifre en az 8 karakterli olmalı");
        }

        if (kontrol == 4) {
            System.out.println("Şifre başarı ile tanımlandı");
        } else {
            System.out.println("İşlem başarısız, lütfen yeni bir şifre giriniz");
        }

    }
}
