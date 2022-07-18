package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

         // kullanicidan bir sayi isteyin
        // sayi poztifse sayiyi yazdirin
       // sayi sıfır veya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            System.out.println(sayi);
        } else {
            System.out.println("Lütfen bir sayı daha giriniz");
            int sayi2 = scan.nextInt();
            System.out.println(sayi*sayi2);
        }


        /*
          Eger if else icerisinde yeni kodlar varsa
          ternary ile yapmamiz mumkun olmaz
         */





    }
}
