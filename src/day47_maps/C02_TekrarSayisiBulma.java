package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        // Verilen bir Stringdeki kullanılan harfleri
        // ve kullanılan harflerin tekrar sayısını
        // H = 20 şeklinde yazdırın

        String str = "Heeeeellllooooo Woooorrrrllllllddddd.";

        // spaceleri ve özel karakterleri saymaması için önce onları yok edelim

        str = str.replaceAll("\\W", "");
        String[] harflerArr = str.split("");
        System.out.println(Arrays.toString(harflerArr));

        // Harfleri key, kullanım adedini value olarak kabul eden bir map oluşturalım.

        Map<String, Integer> harfKullanimSayilariMap = new TreeMap<>();
        Integer harfKullanimSayisi;
        for (String each : harflerArr) {
            if (!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each, 1);
            } else {
                harfKullanimSayisi = harfKullanimSayilariMap.get(each);
                harfKullanimSayilariMap.put(each, harfKullanimSayisi + 1);
            }
        }
        System.out.println(harfKullanimSayilariMap);
    }
}