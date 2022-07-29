package day34_inheritance;

public class Isci extends Personel {
    /*
    Normal hayatımızda parent, çocuk sahibi olmaya karar verebilir.
    Javada child classlar özelliklerini inherit etmek istedikleri
    classı kendilerine paretn edinirler.

    Mesela Isci classını oluşturunca nelere ihtiyacı var diye düşünsek
    Personel classındaki tüm variable ve methodlara ihtiyacı olduğunu görebiliriz.
    Bu durumda yeniden o variable ve methodları oluşturmak yerine
    Personel classını kendimize parent ediniriz.

    Bir classı parent edinmek için extends keyword kullanmalıyız.

    Bri class başka bir classı parent edindiğinde
    1 - Parent classdaki tüm özelliklere (variable + method) otomatik olarak sahip olur.
    2 - Parent classdaki özelliklerden bazılarının kendine uyarlayabilir.
    3 - Parent classda olmayan bazı yeni özellikler oluşturabilir.
    NOT: Parent classdaki özelliklerden hiçbiri reddedemez ama değiştirebilir.
     */

    int persNo = 1001;

    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim); // İsim belirtilmedi
        // Kendi classımızda isim variable'ı yok, onun için parent classa gidiyoruz.        isci1.isim = "Selim";

        System.out.println(isci1.persNo); // 1001 kendi classımızda varsa onu kullanır.

        isci1.maas(); // İşçiler minimum 15 euro saat ücreti alır
    }

    public void maas() {
        System.out.println("İşçiler minimum 15 euro saat ücreti alır");
    }

    public void ozelSigorta() {
        System.out.println("İşçilerden isteyene % 50 indirimli özel sigorta yaptırılır");
    }
}