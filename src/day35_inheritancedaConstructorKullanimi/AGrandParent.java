package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    /*
    Her classta görünmese bile bir constructor vardır.
    Bu classtan obje oluştrmak istediğimizde
    default constructor devreye girecektir.

    Default constructorı gözlemleyemeceğimiz için
    onun yerine kullanılabilecek parametresiz construcotr oluşturalım.
     */

    protected String granpaKulupAdi = "Granpa kulübü";

    AGrandParent () {
        System.out.println("Granpa constructor çalıştı");
    }
}