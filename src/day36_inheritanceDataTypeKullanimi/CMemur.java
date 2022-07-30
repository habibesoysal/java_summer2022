package day36_inheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe {

    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Memurlar : " + (30 * saatUcreti * gunlukMesai) + " maaş alır");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar % 60 indirimli özel sigorta yaptırabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); // Memurlar : 3240 maaş alır
        mmr1.ozelSigorta(); // Memurlar % 60 indirimli özel sigorta yaptırabilir
        mmr1.sigorta(); // Personel
        System.out.println(mmr1.isim); // Personel
        System.out.println(mmr1.soyIsim); // Personel
        System.out.println(mmr1.departmant); // Personel

        BMuhasebe mhsb1 = new BMuhasebe();
        /*
        Her ne kadar Memur classının içinde olsam da
        oluşturduğum obje Muhasebe classından
        Çünkü data türü ve cons BMuhasebe
         */

        System.out.println(mhsb1.gunlukMesai); // 8 Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Personel minimum 3240 maaş alır Muhasebe
        mhsb1.ozelSigorta(); // İsteyen çalışanlara özel % 50 indirimli özel sigorta yapılır Muhasebe
        mhsb1.sigorta(); // Personel
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyIsim); // Personel
        System.out.println(mhsb1.departmant); // Personel
    }
}