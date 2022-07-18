package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        // kullanıcıdan ismini alıp ilk harfini büyük harf olarak yazdıralım


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        char ilkHarf= scan.next().charAt(0);

        System.out.println("İsmin ilk harfi: " + ilkHarf);

        /*
        Kullanıcıdan bilgi almak için her zamanki gibi Scanner objesi oluşturduk.

        Sonra ekrana "Lütfen isminizi giriniz" yazdık ki kullanıcı ne gireceğini bilsin.

        Sonra içinde sadece tek bir karakter barındırabilen char türünde bir değişken oluşturduk.
        Çünkü amacımız komple ismi değil sadece ilk harfini almak.

        char değişkenine ilkHarf ismini verdik.

        Sonrası biraz değişik işte. char değişkenindeki değeri Scanner objesiyle ilişkilendirebilmek için
        charArt komutunu kullandık. Arada yazan toUpperCase ise harfi büyük harfe çeviren bir komut.
        Yani kullanıcı ister ali şeklinde ister Ali şeklinde ister ALİ şeklinde girsin
        kod ilk harfi daima A şekline dönüştürecek. Bunun tam tersi için toLowerCase kullanırız.
        Bu da ilk harfi a şekline dönüştürür. Neyse konumuza dönelim.

         */









    }
}
