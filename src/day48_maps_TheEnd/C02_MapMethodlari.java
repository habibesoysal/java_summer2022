package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        ReusableMethods.entryYazdir(sinifListMap);
        sinifListMap.clear();
        System.out.println("cleardan sonra map : " + sinifListMap);

        sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104, "Aradığınız key yok")); // Derya, Deniz, Devops
        System.out.println(sinifListMap.getOrDefault(110, "Aradığınız key yok")); // Aradığınız key yok

        System.out.println(sinifListMap.isEmpty()); // false

        sinifListMap.putIfAbsent(104, "Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108, "Aysun, Can, Devops");
        ReusableMethods.entryYazdir(sinifListMap);

         /*
          sinifListMap'e key olarak 106 yoksa, value "Mevlüt, Han, Tester" ekleyin.
          106 daha önceden varsa "eski değeri değiştirmek istediğinizden emin misiniz?" yazdırın.

          106'nın olduğunu kontrol etmek için containsKey daha mantıklı ama biz
          yeni öğrendiğimiz method ile yapalım.

          map.putIfAbsent(key, value) ==> key varsa ekleme yapmaz, bize o key ile kayıtlı olan valueyu getirir.
                                          key yoksa eklemeyi yapar ve bize null döndürür.
         */

        System.out.println(sinifListMap.putIfAbsent(106, "Mevlüt, Han, Tester")); // Taha, Deniz, JDev

        if (sinifListMap.putIfAbsent(106, "Mevlüt, Han, Tester") == null) {
            System.out.println("Kayıt başarılı");
        } else {
            System.out.println("Eski değeri değiştirmek istediğinizden emin misiniz ?");
        }
        System.out.println(sinifListMap.putIfAbsent(109, "Mevlüt, Han, Tester")); // null
        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.remove(106); // 106'yı silip sildiğini döndürür.
        sinifListMap.remove(107,"Derya, Cem, Tester"); // silerse true silmezse false döndürür.
        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.replace(105,"Erdal, Çiftçi, Tester");
        sinifListMap.put(109, "Cavidan, Eken, JDev");
        ReusableMethods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.size()); // 7
    }
}