package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        /*
        Kullanıcıdan gün numarasını alıp
        1 ise pazartesi...
        7 ise pazar yazdılarım.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün numarası giriniz");
        int gunNo = scan.nextInt();

        switch (gunNo) {
            case 1 :
                System.out.println(gunNo + " numaralı gün : Pazartesi");
                break;
            case 2 :
                System.out.println(gunNo + " numaralı gün : Salı");
                break;
            case 3 :
                System.out.println(gunNo + " numaralı gün : Çarşamba");
                break;
            case 4 :
                System.out.println(gunNo + " numaralı gün : Perşembe");
                break;
            case 5 :
                System.out.println(gunNo + " numaralı gün : Cuma");
                break;
            case 6 :
                System.out.println(gunNo + " numaralı gün : Cumartesi");
                break;
            case 7 :
                System.out.println(gunNo + " numaralı gün : Pazar");
            default :
                System.out.println("Lütfen geçerli bir gün numarası giriniz");
        }





    }
}
