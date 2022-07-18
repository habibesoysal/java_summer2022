package day11_stringManipulations;

import java.util.Locale;

public class C04_contains {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */

        String cumle = "Java büyük, dünya küçücük";
        cumle = cumle.toLowerCase();

        // Requirements'te büyük/küçük harf hassasiyeti hakkında bir şey söylenmemiş.
        // Her iki kelimeyi de içerme durumu açıklanmamış.
        // Bu durumda görevi kim verdiyse ona sormak lazım.

        // Ek requirements : İkinisi de içeriyorsa "Karar ver büyük mü yazdırayım küçük mü?"
        // Case sensitive olmasın.

        if (cumle.contains("büyük") && (cumle.contains("küçük"))){
            System.out.println("Karar ver büyük mü yazdırayım küçük mü?");
        } else if (cumle.contains("küçük")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("büyük")) {
            System.out.println(cumle.toUpperCase());;
        } else {
            System.out.println("Cümle \"küçük\" ya da \"büyük\" kelimesi içermiyor.");
        }
    }
}
