package day26_constructor;

public class Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka = markaR;
        model = modelR;
        yil = yilR;
        fiyat = fiyatR;
    }
    /*
    Biz herhangi bir constructor oluşturduğumuzda
    Java default constructor'ı siler.
    Eğer biz projemizde bir sorun yaşanmasını istemiyorsak
    default constructor yerine mutlaka
    parametresiz bir contructor oluşturmalıyız.
     */

    public Araba() {

    }

    public void benzinliAracMethodu() {
        System.out.println("Bu araç benzinli motora sahiptir.");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba max " + hiz + " mk hız yapar.");
    }


}
