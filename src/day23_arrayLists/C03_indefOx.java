package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indefOx {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("İkram");
        urunler.add("Çekirdek");
        urunler.add("Çay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("İkram")); // 1
        System.out.println(urunler); // [Nutella, İkram, Çekirdek, Çay]

        /*
        indexOf methodu bilgi döndürür.
        Listeyi değiştirmez.
         */

        System.out.println(urunler.lastIndexOf("İkram")); // 1

        /*
        indexOf methodu ürünü aramaya sıfırıncı indexten
        lastIndexOf ise son indexten başlar.

        Arama bitip ürün bulunduğunda ikisi de bulunan ürünün indexini verir.
         */

        urunler.add("İkram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("İkram")); // 1
        System.out.println(urunler.lastIndexOf("İkram")); // 4

        System.out.println(urunler.indexOf("Hobby"));
        System.out.println(urunler.lastIndexOf("Hobby"));
    }
}