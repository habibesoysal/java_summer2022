package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap =ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap); // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        // valueları sıra numaralı olarak yazdırın
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        // İsim ve soyisimlerin birlikte olacağı bir liste oluşturun
        List<String> sinifIsimSoyisimList = ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("İsim soyisim listesi : " + sinifIsimSoyisimList);

        // kaç farklı branş varsa bransIsmi = branstakiOgrenciSayisi şeklinde yazdırın
    }
}