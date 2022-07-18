package day14_mehtodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        // Kullanıcıdan şehir ismini ve doğum tarihini alıp
        // bunları programda kullanacağımız formatta bize döndüren bir method oluşturalım
        // Şehir ismini programımızda büyük harf olarak
        // tarihi ise 2022-06-30 şeklinde kullanmak istiyoruz

        /* Eger bir class'İn icerisinde herhangi bir hesaplama yapip bunu da kalici olarak saklamak istersek
kodumuzu sade ve anlasilir tutmak icin islemi bir method'da yapip
sonucunu main methoda dondurebiliriz
Return type'ı void olmayan bir methodun soncunu main method'da bir variable'a atama yaparsak programin geri kalaninda
bu yeni degeri kullanma sansimiz olur

 */

        String sehir = sehirAL();
        String tarih = tarihAl();

        System.out.println("Girdiğiniz şehir : " + sehir);
        System.out.println("Girdiğiniz tarih : " + tarih);

    }

    public static String sehirAL() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen şehir adı giriniz : ");
        String sehirAdi = scan.next().toUpperCase();
        return sehirAdi;
    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        int yil = scan.nextInt();
        if (yil > 1900 || yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("Geçersiz yıl (1900-2100)");
        }
        System.out.print("Kaçıncı ay olduğu tam sayı olarak yazınız : ");
        int ay = scan.nextInt();

        if (ay <= 0 || ay > 12) {
            System.out.print("Lütfen geçerli bir ay numarası giriniz");
        } else if  (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.print("Ayın kaçıncı günü olduğunu tam sayı olarak giriniz : ");
        int gun = scan.nextInt();

        if (gun <= 0 || gun > 31) {
            System.out.print("Gün no olarak 1-31 arasında sayı girilmelidir");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
           tarih = tarih + gun;
        }
        return tarih;
    }


}
