package day41_abstractClass_Interface;

public class GCorolla extends EToyota{
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }

    /*
    Corolla classının 2 tane parentı var.
    Corolla parentlarının ikisinin de standartlarına (abstract method) uymak zorundadır.

    Concrete bir class parentı olan tüm abstract classlarda
    abstract olan methodları implement etmek zorundadır.
    Ancak parent silsilesinde override edilerek concrete yapılan methodları
    override etmek zorunda değildir.
     */
}