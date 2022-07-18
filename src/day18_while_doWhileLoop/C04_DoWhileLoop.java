package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan tam sayılar alın.
        Kullanıcı çift sayı girdiği müddetçe sayıları yazdırın
        tek sayı girdiğinde işlemi bitirin.
         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        // While ile yapalım

        /*
            Looplarda kullanacağımız variable'ları looptan önce oluşturmalıyız.
            while loopta, looptan önce oluşturduğumuz bu variable'a atayacağımız değeri
            iyi düşünmemiz gerekiyor.
         */

        while (sayi % 2 ==0) {
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0){
                System.out.println("Girilen sayı çift : "  + sayi);
            } else {
                System.out.println("Girdiğiniz sayı tek, benden bu kadar");
            }
        }

        // Do While ile yapalım

        /*
        Do while loopta önceden oluşturulan variable'a hangi değer atandığının hiçbir önemi yok.
        Kodumuz her durumda çalışır.

        Do While'ın dezavantajı :
        İlk çalıştırma kontrol yapılmadan gerçekleştirildiği için
        loopun body'sinde yanlış bir işlem yapılmamasına dikkat etmek gerekir.
         */

        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0){
                System.out.println("Girilen sayı çift : "  + sayi);
            } else {
                System.out.println("Girdiğiniz sayı tek, benden bu kadar");
            }
        } while (sayi % 2 ==0);

    }
}

