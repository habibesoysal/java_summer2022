package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        Farklı bir classta çalışırken herhangi bir class adını yazıp .'ya basarsak
        adını yazdığımız classtaki tüm static class üyelerini görebilir ve kullanabiliriz.
        */
        C02_StaticVariables.staticMethod(); // 10
        System.out.println(C02_StaticVariables.staticSayi); // 10
        System.out.println(C02_StaticVariables.degersizStaticVar);
        /*
        Class level variable'lara değer atayıp atamamak bize kalmıştır.
        İstersek değer ataması yaparız istemezsek değer atamayız.
        Eğer değer atmışsak Java atadığımız o değeri kabul eder.
        Değer atamazsak Java bu variable'lara default bir değer ataması yapar.
        int --> 0
        String --> null
        boolean --> false
        char --> '' (hiçlik)
         */

        /*
        Başka classtaki instance variable'lara obje oluşturarak ulaşabiliriz.
         */

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10
        // Bu method içinde staticSayi = 20 oldu.

        System.out.println(obje1.isim); // Mehmet
        System.out.println(obje1.degersizInstanceVarible); // 0

        System.out.println( C02_StaticVariables.staticSayi); // 20

        /*
        Farklı bir classtan C02 classın method ve variable'ları kullandığımızda
        C02 classının tamamı değil sadece ilgili class üyeleri çalışır.
         */

    }
}
