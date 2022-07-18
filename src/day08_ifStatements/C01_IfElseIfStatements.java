package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan gun ismini yazmasini isteyin.
        Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini
        ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gun = scan.next().toLowerCase();

        if (gun.equals("pazartesi") || (gun.equals("pazar"))) {
            System.out.println("Paz");
        } else if (gun.equals("salı")) {
            System.out.println("Sal");
        } else if (gun.equals("çarşamba")) {
            System.out.println("Çar");
        } else if (gun.equals("perşembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma") || (gun.equals("cumartesi"))) {
            System.out.println("Cum");
        } else System.out.println("Lütfen geçerli bir gün ismi giriniz");

    }
}
