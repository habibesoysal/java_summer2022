package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
         Kullanıcıdan toplanmak üzere sayılar alın.
         Sayıların toplamı 500'ü geçince (500 dahil)
         sayıların toplamını ve kaç sayı toplandığını şu şekilde yazdırın:

         13 sayı girdiniz ve toplamları 567
        */

        int toplam = 0;
        int sayi = 0;
        int sayac = 0;
        Scanner scan = new Scanner(System.in);

        while (toplam < 500) {
            System.out.println("Lütfen toplamak için sayı giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println(sayac + " sayı girdiniz ve toplamları : " + toplam);
    }
}
