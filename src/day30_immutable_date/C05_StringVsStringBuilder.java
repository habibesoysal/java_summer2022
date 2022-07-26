package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder mı daha hızlıdır ?
        Bunun için bir String oluşturup 1000 kere sonuna . ekleyelim.
        Öncesinde ve sonrasında zamanı alıp
        aradaki farkı bulalım.

        Aynı işlemi StringBuilder için de yapalım.
         */

        LocalTime baslangic = LocalTime.now();

        String str = "Ahhhh Fava";
        for (int i = 0; i < 10000; i++) {
            str += ".";
        }

        LocalTime bitis = LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman : " + (bitis.getNano() - baslangic.getNano()));


        baslangic = LocalTime.now();

        StringBuilder sb = new StringBuilder("Ahhhh Java");
        for (int i = 0; i < 10000; i++) {
            sb.append(".");
        }

        bitis = LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("StringBuilder zaman : " + (bitis.getNano() - baslangic.getNano()));
    }
}