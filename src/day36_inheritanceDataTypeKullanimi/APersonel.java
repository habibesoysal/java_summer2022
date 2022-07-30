package day36_inheritanceDataTypeKullanimi;

public class APersonel {

    protected String isim = "İsim belirtilmedi";
    protected String soyIsim = "Soyisim belirtilmedi";
    protected String departmant = "Departman belirtilmedi";

    protected void maas () {
        System.out.println("Tüm personelimiz maaş alır");
    }

    protected void sigorta () {
        System.out.println("Tüm personelimize sigorta yapılır");
    }

}