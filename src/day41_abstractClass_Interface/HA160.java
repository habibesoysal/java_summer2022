package day41_abstractClass_Interface;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class HA160 extends FMercedes {

    /*
    Abstract parent silsilesinden gelen ilk concrete class
    parentı olan tüm classlardaki abstract methodları
    concrete hale dönüştürmek (override etmek) zorundadır.

    Bu kuralın istisnası parent classlardan herhangi birinde
    concrete hale dönüştürülmüş abstract methodlardır.
     */

    public static void main(String[] args) {
        HA160 arb1 = new HA160();
        // concrete bir classtan istediğimiz objeyi üretebiliriz.

        FMercedes arb2 = new FMercedes();
        // Mercedes de concrete

        // EToyota arb3 = new EToyota();
        // Abstract classlar conctructor barındırır ama obje üretemezler.
        // Toyota classı abstract class olduğundan obje üretilemez.

        /*
        List<String> list = new List<String>();
        List<String> list2 = new ArrayList<>();

        Abstract bir classın özelliklerini taşıyan bir obje oluşturmak istediğimizde
        data türünü istediğimiz abstract class, constructorı ise childı olan concrete bir classtan seçeriz.
         */
    }
}