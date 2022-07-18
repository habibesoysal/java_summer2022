package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // bir önceki soruyu kullanıcıdan tek seferde tüm bilgileri alarak yapınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi soyisminizi ve yaşınızı giriniz \n aralarda enter tuşuna basınız");

        String isim= scan.nextLine();
        String soyIsim= scan.nextLine();
        int yas= scan.nextInt();

        System.out.println("Girilen bilgiler: " + "İsim: "  + isim + " " + "Soyisim: " + " " + soyIsim + " " + "Yaş: " + " " + yas);

    }
}
