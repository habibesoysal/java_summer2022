package day19_scope;

public class C01_InstanceVariables {
    /*
    Class içerisinde her yerden kullanmak istediğimiz variable'ları
    class level'da (classın içinde ama methodların dışında)
    genellikle class level variable'lar classın başında oluşturulur (şart değil)

    Class leveldeki variablelar için 2 scope vardır:
    1 - Static variables (class variables)
    2 - instance (static olmayan) variables (obje variableları)
     */

    int instSayi = 20; // static olmayıp class leveda olduğu için instance variable'dır.

    public static void main(String[] args) {
        int sayi = 10;
        /* System.out.println(instSayi);
        instance variables, static olmadığı için static kulübe üye main methodan doğrudan kullanamayız.
        instance variableların diğer adı object variable
        dolayısıla obje oluşturursak instance varibale'ları her yerden kullanabiliriz.
         */

        C01_InstanceVariables obje1 = new C01_InstanceVariables();
        System.out.println("obje1 değişmeden önce : " + obje1.instSayi); // 20
        obje1.instSayi = 30;
        System.out.println("obje1 değiştikten sonra : " + obje1.instSayi); // 30

        C01_InstanceVariables obje2 = new C01_InstanceVariables();
        System.out.println("obje2 değişmeden önce : " + obje2.instSayi); // 20
        obje2.instSayi = 25;
        System.out.println("obje2 değiştikten sonra : " + obje2.instSayi);

        C01_InstanceVariables obje3 = new C01_InstanceVariables();
        System.out.println("obje3 değişmeden önce : " + obje3.instSayi); // 20
        /*
        Her obje oluştuğunda instance (obje variable'ının) ilk atanan değerini alır.
         */


    }

    public static void staticMethod() {
        // System.out.println(sayi);
        /*
        Bir methodun içerisinde oluşturulan variable,
        sadece o methodun içinden kullanılabilir.
        (Local varaibles)
         */

        /*
        instSayi = 30;
        instance variable'lara main method dışındaki static methodlardan da doğrudan ulaşamayız.
        Obje oluştururusak ulaşabiliriz.
        */

        C01_InstanceVariables obje4 = new C01_InstanceVariables();
        System.out.println(obje4.instSayi);
    }

    public void staticOlmayanMethod() {

        System.out.println(instSayi);
        /*
        instance variable'lar class içerisindeki
        static olmayan methodlardan doğrudan kullanılabilir.
         */


    }
}
