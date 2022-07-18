package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {

        // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
        // kalan elementleri yeni bir array yapin

        String[] sehirler = {"İstanbul", "Ankara", "Mersin", "Konya", "Kastamonu"};
        String istenmeyenHarf = "r";
        List<String> kalanlar = new ArrayList<>();

        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)) {
                kalanlar.add(sehirler[i]);
            }
        }
        // Loop bittiğinde istenmeyen harfi içermeyen şehirler listeye eklenmiş olacak.
        System.out.println(kalanlar); // [Mersin]

        // Yeni bir array oluşturup listeyi ona aktaralım.
        String[] kalanlarArrayi = new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArrayi.length; i++) {
            kalanlarArrayi[i] = kalanlar.get(i);
        }

        // Şehirler arrayinin yeni değerini atayalım.
        sehirler = kalanlarArrayi;
        System.out.println("Şehirler arrayinin son hali : " + Arrays.toString(sehirler));
    }
}