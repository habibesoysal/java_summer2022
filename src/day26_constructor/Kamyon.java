package day26_constructor;

public class Kamyon {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

        /*
        Bizim temel amacımız KamyonRunner'da argument olarak girilen değerin
        Kamyon classında instance variable'a atanması.
        Ancak scope konusunda öğrendiğimiz gibi
        Kamyon constructor scope'unda marka olduğu için
        instance marka'ya gitmiyor.

        Bu karışıklığı gidermek için instance variableları
        belirli hale getirmemiz lazım.
        Java bunun için this keywordu oluşturmuştur.

        Genel kullanım açısından this keywordu kodu herkesin anlamasını kolaylaştırdığı için
        tercih edilir.
         */

    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon() {

    }

    @Override
    public String toString() {
        return
                "\nmarka : " + marka +
                        "\nmodel : " + model +
                        "\nyil : " + yil +
                        "\nfiyat : " + fiyat;

    }
}