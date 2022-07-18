package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        /* kullanıcıdan ismini soyismini ve yaşını alıp
        girilen bilgiler = isim soyisim yaş şeklinde yazdırın
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim = scan.next();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("Girilen bilgiler: " + " " + isim + " " + soyIsim + " " + yas);

    }
}
