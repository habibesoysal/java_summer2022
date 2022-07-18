package day14_mehtodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // Input olarak verilen isim ve soyismi
        // ilk harfi büyük geriye kalan harfler * olacak şekilde
        // İ**** K**** şeklinde yazdıran bir method oluşturalım

        String isim = "Enes";
        String soyIsim = "Bozkurt";

        ismiGizle(isim, soyIsim);
        C02_MethodCreation.rakamlariTopla(654);
    }

    public static void ismiGizle(String isim, String soyIsim) {

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");

        System.out.println(isim + " " + soyIsim);

    }
}
