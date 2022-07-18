package day10_stringManipulations;

public class C05_Length {
    public static void main(String[] args) {

        String str = "Java öğren, işi kap";

        System.out.println(str.length()); // str'ın karakter sayısını döndürür.

        System.out.println(str.charAt(str.length() - 1)); // Son karakterinin indexini verip yazdırır.

        System.out.println(str.charAt(str.length() - 3)); // Sondan üçüncü karakteri yazdıralım.


        /*
        Java'da null pointer (işaretleyici) bir değer değil
        karşısına yazıldığı variable'ın hiçbir değer almadığının işaretçisidir.
         */

        String str2 = ""; // str2'ye bir değer atandı mı? EVET
                          // Değer nedir ? HİÇLİK

        System.out.println(str2.length()); // 0

        String str3 = null; // str3'e bir değer atandı mı? HAYIR
                            // null, bu değer atamamayı işaret etmektedir.

        System.out.println(str3.length()); // Bir değer atanmamış ki nasıl uzunluğu olsun?
                                           // NullPointerException olarak hata verir.





    }
}
