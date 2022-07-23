package day25_constructor;

public class C05_Car {
    /*
    Bu class bizim kalıphanemiz.
    Bir araba oluşturmak için ihtiyacımız olan variable ve mehtodları bul classta belirleriz.
    Sonra farklı classlarda araba oluşturmamız gerekirse bu classta obje oluşturup burada berlirlenen
    variable ve methodlara göre araba üretiriz.
     */

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;


    public void benzinliAracMethodu() {
        System.out.println("Bu araç benzinli motora sahiptir.");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba max " + hiz + " mk hız yapar.");
    }
}