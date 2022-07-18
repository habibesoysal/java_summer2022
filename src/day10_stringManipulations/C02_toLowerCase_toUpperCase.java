package day10_stringManipulations;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Beni psikopata bağlamayın";

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        /*
        Eğer büyük-küçük harf dönüşümünde lokal bir dili esas almak istersek bu method kullanılabilir.
         */



    }
}
