package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {

    /*
    extends keyword kullanılan classlarda
    ister default cons bulunsun
    ister biz yeni conslar oluşturalım
    Java cons'ın ilk satırına
    super(); cons call yazar.

    super(); cons call default cons'a benzer.
    Görünmese de orada vardır ve çalışır.
    Ancak biz ilk satıra farklı bir cons call yazarsak
    Java super(); 'i siler.

    Eğer biz mğdahale edip kendi cons call'umuzu oluşturmazsak
    Java'nın default olarak oluşturduğu cons call her zaman parametresizdir

     */

    FMemur(){
        System.out.println("Memur parametresiz cons");
    }
    FMemur(String isim){
        System.out.println("Memur parametreli cons");
    }

    public static void main(String[] args) {

        FMemur mmr1 = new FMemur("ali");
    }
}