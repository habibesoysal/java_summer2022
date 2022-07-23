package day26_constructor;

public class C01_Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public C01_Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka = markaR;
        model = modelR;
        yil = yilR;
        fiyat = fiyatR;
    }
    /*
    Biz herhangi bir constructor oluşturduğumuzda
    Java default constructor'ı siler.
    Eğer biz projemizde bir sorun yaşanmasını istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir contructor oluşturmalıyız.
     */

    public C01_Araba() {

    }


    public void benzinliAracMethodu() {
        System.out.println("Bu araç benzinli motora sahiptir.");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba max " + hiz + " mk hız yapar.");
    }


}
