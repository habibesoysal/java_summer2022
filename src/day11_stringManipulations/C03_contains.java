package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
         /*
         Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
         @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
         @gmail.com ile bitmiyorsa lutfen yazimi kontrol edin yazdirin
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen e-mail adresinizi giriniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("Lütfen gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com") == (email.length()-10)) {
            System.out.println("E-mail adresiniz kaydedildi.");
        } else System.out.println("Lütfen yazımı kontrol edin.");
    }
}