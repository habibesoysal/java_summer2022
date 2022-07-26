package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        // % 25 indirimli fiyatı hesaplayıp bize döndüren bir method oluşturalım

        double satisFiyatı = 100;
        double indirimOrani = 60;

        double indirimliFiyat = indirimliFiyatHesapla(satisFiyatı, indirimOrani);
        System.out.println("İndirimli fiyat : " + indirimliFiyat);
        System.out.println("İndirimli fiyat : " + indirimliFiyat);
        System.out.println("İndirimli fiyat : " + indirimliFiyat);
        System.out.println("İndirimli fiyat : " + indirimliFiyat);
        System.out.println("İndirimli fiyat : " + indirimliFiyat);
    }

    public static double indirimliFiyatHesapla(double satisFiyatı, double indirimOrani) {
        double indirimliFiyat = satisFiyatı * (1 - indirimOrani / 100);

        return indirimliFiyat;

    }
}