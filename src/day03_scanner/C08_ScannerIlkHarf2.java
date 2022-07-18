package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isim giriniz");

        char ilkHarf = scan.next().charAt(0);

        System.out.println("Girilen ismin ilk harfi: " + ilkHarf);

        /*
        Kullanıcıdan veri alabilmek için her zamanki gibi Scanner objesi oluşturduk.

        Sonra ekrana "Lütfen isminizi giriniz" yazdık ki kullanıcı ne gireceğini bilsin.

        Sonra içinde sadece tek bir karakter barındırabilen char türünde bir değişken oluşturduk.
        Çünkü amacımız komple ismi değil sadece ilk harfini almak.

        char değişkenine ilkHarf ismini verdik.

        char değişkenindeki değeri Scanner objesiyle ilişkilendirebilmek için scan.next yazdık.

        Sonrası biraz değişik işte. En son yazdığımız scan.next() ifadesi String türünde.
        Oysaki biz metnin tamamını değil sadece ilk harfini istiyoruz. Bundan dolayı yanına charAt() ekledik.
        Parantez içine de 0 yazdık çünkü Java'da indeksler 1,2,3 şeklinde değil 0,1,2,3 şeklinde başlıyormuş.
        Dolayısıyla ilk harf 0'a denk geliyor. Mesela eğer üçünü harfi isteseydik 2 yazmamız lazımdı.

        Bu durumda kullanıcı kalem ifadesini girdiğinde k harfi sıfırıncı indekse, a harfi birinci indekse denk geliyor.
        Bütün bunların sonucunda ilk harfi alıp en sonda da sout komutuyla ilkHarf değişkeninin değerini yazdırdık.

         */

    }
}
