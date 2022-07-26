package day25_constructor;

public class C03 {
    /*
    Proje oluştururken bazı classlar run etmek için değil
    variable ve method oluşturup
    bunları başka classlardan kullanmak için oluşturulur.
     */

    /*
    Default constructor parametresizdir
    göremesek bile ihtiyaç olduğunda çalışır.

    Class içerisinde parametreli veya parametresiz
    herhangi bir constructor oluşturursak
    Java default constructor'ı siler.
     */

    C03(){

    }

    /*
    Oluşturduğumuz parametresiz bu constructor default constructor ile
    bire bir aynıdır. Ama biz oluşturduğumuz için buna
    default conctructor demeyiz.
    Parametresiz consctructor deriz.
     */

    String isim = "Etka";

    public void method01(){
        System.out.println("C03 method çalıştı");
    }

}
