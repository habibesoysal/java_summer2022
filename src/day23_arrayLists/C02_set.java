package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        Elimizde ürünlerin bulunduğu bir liste var.
        Ürün listesindeki istenen sıradaki ürünü
        istediğimiz yeni ürünle değiştirip
        eski ürünü var olan eski ürünler listesine ekleyelim.
         */

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("İkram");
        urunler.add("Çekirdek");
        urunler.add("Çay");

        List<String> eskiUrunler = new ArrayList<>();
        // Listedeki İrkam'ın yerine Biskrem koyalım
        // İkram'ı da eski ürünler listesine ekleyelim.

        String yeniUrun = "Biskrem";
        String silinecekUrun = "İkram";

        int temp = urunler.indexOf(silinecekUrun);
        String silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Ürünler listesi : " + urunler);
        System.out.println("Eski ürünler listesi : " + eskiUrunler);

        yeniUrun = "Kahve";
        silinecekUrun = "Çay";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Ürünler listesi : " + urunler);
        System.out.println("Eski ürünler listesi : " + eskiUrunler);

        yeniUrun = "Fındık";
        silinecekUrun = "Çekirdek";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Ürünler listesi : " + urunler);
        System.out.println("Eski ürünler listesi : " + eskiUrunler);
    }
}