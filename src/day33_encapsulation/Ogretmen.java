package day33_encapsulation;

public class Ogretmen {
    private String isim;
    private String soyIsim;
    private String brans;

    /*
    Bazen de yetkileri sınırlamak değil de
    yapılan işi daha iyi tanımlamak için
    encapsulation kullanılır.

    Bu yaklaşımı kullanan classlarda
    tüm variablelar private yapılıp
    hepsi için getter ve setter oluşturulur.
     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}