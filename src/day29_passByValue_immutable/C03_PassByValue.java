package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        Bir list oluşturalım. İki ayrı methoddan birinde sadece elemanları değiştirelim,
        diğerinde yeni bir list atayıp aynı sayıda yeni eleman ekleyelim.
        Her iki method calldan sonra kendi listemizi main method içerisinde kontrol edelim.
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("İlk başta list : " + list); //  [Ali, Veli, Can]

        elemanlariDegistir(list);

        System.out.println("elemanDegistir mehodundan sonra : " + list); // [Oğuz, Murat, Fatih]

        listDegistir(list);

        System.out.println("listDegistir methodundan sonra " + list); // [Oğuz, Murat, Fatih]
    }

    public static void listDegistir(List<String> list) {

        list = new ArrayList<>();
        list.add("Nutella");
        list.add("Çay");
        list.add("Çokokrem");

        System.out.println("listDegistir methodunda " + list); // [Nutella, Çay, Çokokrem]
    }

    public static void elemanlariDegistir(List<String> list) {
        list.set(0, "Oğuz");
        list.set(1, "Murat");
        list.set(2, "Fatih");

        System.out.println("elemanDegistir methodunda : " + list); // [Oğuz, Murat, Fatih]
    }
}