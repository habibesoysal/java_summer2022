package day47_maps;

import day46_maps.ReusableMethods;
import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        // Öğrenci listesini isim soyisim olarak yazdırın.
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // Kaç farklı branş varsa bransIsmi = branstakiOgrenciSayisi şeklinde yazdırın,
        ReusableMethods.bransOgrenciSayisiYazdir(sinifListMap);

    }
}