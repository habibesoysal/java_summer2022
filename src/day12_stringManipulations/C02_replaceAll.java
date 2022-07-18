package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        // str'ı "Bugün Java çok güzel" haline getirelim.
        // replaceAll methodundaki All'un amacı aynı özellikteki tüm karakterleri kapsamasıdır.
        // Bütün sayıları sil
        // Bütün özel karakterleri sil

        // Tüm özel karakterleri silelim dediğimizde spaceler de siliniyor.
        // Spaceleri korumak için en başta onların yerine cümlede bulunmayacak
        // bir String koyalım.
        // "qazwsx"

        str = str.replaceAll(" ", "qazwsx");

        str = str.replaceAll("\\W", "");
        System.out.println(str);

        str = str.replaceAll("\\d", "");

        // İstenmeyen özel karakter ve sayılardan kurtulduk şimdi spaceleri geri getirelim.

        str = str.replaceAll("qazwsx", " ");

        System.out.println(str);
    }
}
