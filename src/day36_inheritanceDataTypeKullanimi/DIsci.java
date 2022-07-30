package day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe {
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("İşçiler : " + (30 * saatUcreti * gunlukMesai) + " maaş alır");
    }

    protected void ozelSigortaIsci() {
        System.out.println("İşçiler % 70 indirimli özel sigorta yaptırabilir");
    }

    public static void main(String[] args) {

        /*
        Bir obje olşuturuluken data türü ve cons aynı classtan ise
        doğrudan o classa gidiyorduk.

        Eğer data türü ve cons farklı ise
        obje cons'ın olduğu classın objesidir.
        Ancak bizden istenen DIsci classındaki spesifik özellikler değil
        bir işçisinin BMuhasebe classındaki tüm çalışanlarla beraber
        sahip olduğu genel özellikleri yazdırır.
         */

        BMuhasebe isc1 = new DIsci();
        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // M Personel minimum : 2400 maaş alır
        isc1.ozelSigorta(); // M İsteyen çalışanlara özel % 50 indirimli özel sigorta yapılır
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyIsim); // P
        System.out.println(isc1.departmant); // P


        APersonel isc2 = new DIsci();
        //System.out.println(isc2.gunlukMesai); // M 8
        //System.out.println(isc2.saatUcreti); // M 10
        isc2.maas(); // M Personel minimum : 2400 maaş alır
        //isc2.ozelSigorta(); // M İsteyen çalışanlara özel % 50 indirimli özel sigorta yapılır
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyIsim); // P
        System.out.println(isc2.departmant); // P

        /*
        Eğer data türü olan classta aradığımız özellik yoksa
        varsa onun parentine gidebilir ama child'a dönüş olmaz.
        Aradığı özelliği bulamazsa Java CTE verir.
         */
    }
}