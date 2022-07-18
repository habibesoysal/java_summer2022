package day19_scope;

public class C02_StaticVariables {

    static int staticSayi = 10;
    String isim = "Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVarible;
    /*
    Class leveldaki variable'lara değer atamasak da Java kabul ediyor.
     */

    public static void main(String[] args) {
        /*
        Bir variable static oluşturulduysa
        objeler için değil class için geçerlidir.
         */
        System.out.println(staticSayi); // 10
        staticMethod();
        staticSayi = 12;
        System.out.println(staticSayi); // 12
        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi); // 20
        /*
        instance bir variable'ın değerini bulabilmek için objenin oluşturulmasından itibaren
        istenen satıra kadar kodu takkip etmeliyiz.

        Static varbaile'da ise classın en başından başlayarak istenen
        satıra kadar kodu takip edip static variabe'ın son değerini bulmamız gerekir.
         */

    }

    public static void staticMethod() {
        System.out.println(staticSayi); // 10
    }

    public void staticOlmayanMethod() {
        /*
        Static variable'lar class içerisinden her yerden ulaşılabilir.
        Static olsun veya olmasın tüm methodlar static variable'ları görebilir ve değiştirebilirler.
        Farklı methodlarda static variable'ın hangi değeri alacağını bilmek istiyorsak
        classın başından itibaren kodun çalışmasını takip etmeliyiz.
        Method ne zaman çağrılırsa o anki static variable değerini methodda kullanbiliriz.
         */
        System.out.println(staticSayi); // 12
        staticSayi = 20;

    }
}
