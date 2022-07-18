package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java çok kolay, Java çok güzel";
        String kelime = "Java";

        /* Verilen kelime için cümlede aşağıdaki şartlardan uygun olanı yazan bir program yazalım.
         - Verilen kelime cümlede kullanılmamış.
         - Verilen kelime cümlede sadece 1 kere kullanılmış.
         - Verilen kelime cümlede birden fazla kullanılmış.
        */

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

    }
}
