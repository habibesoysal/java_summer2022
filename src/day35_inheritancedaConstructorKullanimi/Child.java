package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {

    String isim = "Child isim belirtilmedi";
    protected String childKulupAdi = "Child kulübü";

    Child() {
        System.out.println("Child constructor çalıştı");
    }

    public static void main(String[] args) {
        // AGrandParent gp1 = new AGrandParent();
        // Bu objeyi oluşturmak için Granpa constructor çalışır.
        // Parent veya child constructor çalışmaz.

        Child child1 = new Child();
        child1.granpaKulupAdi = "Child1";
        child1.parentKulupAdi = "Child2";

        // child1 objesi için Child cons çalışır.

        /*
        Java'da bir classı kullanabilmek için
        o classtan obje oluşturur dolayısıyla
        o classın constructorını kullanırdık.

        Java inheritance'da parent classlardaki
        özellikleri kullanabilmek için
        o classların constructorlarını
        otomatik çalıştıran bir yapı kurmuştur.

        Örneğin biz Child classında
        Child classımızdan bir obje oluşturmak istediğimizde
        Child consturctorını kullanırız.

        Java Child constructorını gördüğünde
        önce parent'ın constructorını çalıştırmam lazım der.
        Buradan parent constructora gider.
        Parent classında Parent constructorını görünce
        önce bunu parentının yani Grandparent constructor çalışması gerekir der.
        Böylece extends keyword olmayan classa kdar gider
        ve oradan başlayarak tüm constructorları aşağı doğru çalıştırır.
         */
    }
}