package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        /*
        Kullanıcıdan gün ismini alıp
        hafta içi veya hafta sonu olduğunu yazdıralım
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String gunIsmi = scan.nextLine().toLowerCase();

        switch (gunIsmi) {
            case "pazartesi" :
            case "salı" :
            case "çarşamba" :
            case "perşembe" :
            case "cuma" :
                System.out.println("Hafta içi");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default :
                System.out.println("Lütfen geçerli bir gün ismi giriniz");

        }


    }
}
