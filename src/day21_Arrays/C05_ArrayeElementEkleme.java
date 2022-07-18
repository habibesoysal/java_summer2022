package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sinifListesi = {"Ali Can", "Nida Yücedal", "Musa Yaman"};
        String eklenecekIsim = "Murat Babayiğit";

        sinifListesi = elemanEkle(sinifListesi, eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniSinifListesi = new String[sinifListesi.length + 1]; // [null, null, null, null]
        // Eski listeden 1 eleman fazla uzunlukta yeni bir array oluşturduk
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i] = sinifListesi[i];
        }
        // Öncelikle eski listedeki tüm elemanları yeni listeye taşıdık
        yeniSinifListesi[yeniSinifListesi.length - 1] = eklenecekIsim;
        // Son indekse ise eklenecek ismi atadık
        return yeniSinifListesi;
    }
}