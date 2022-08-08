package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    Normal bir classta olduğumuzu düşünürsek
    iki tane access modifier kullanma ihtimali olamaz.

    Aşağıdaki methodda göreceğiniz gibi
    interfacede istisnai olarak bodysi olan methodlar oluşturulabilir.
    Bu özellik Java 8'den sonra kullanılmaya başlamıştır.
    Bu özellikten önce bir interface'e yeni bir method eklememiz gerektiğinde
    eskiden beri bu interface'i implement eden tüm classlara gidip
    yeni eklenen methodu override etmemiz gerekirdi.

    Bu özellik sayesinde başına default veya static keyword ekleyerek
    interfacede yeni bodysi olan bir method oluşturursak
    bu methodun child classlar tarafından override edilme mecburiyeti olmaz.
    Ve eskiden implement etmiş classları değiştirmemiz gerekmez.

    Bu istisnai bir durumdur ve interface için oluşturulan
    genel kuralları bozmaz.

    Bu methodların bodysi olsa da bunlara concrete method denmez.
    Ama override edilme mecburiyetleri yoktur.

    Buradaki default kelimesi access modifier değil
    istisnai durumun belirtecidir.

    O zaman niçin 2 keyword (static ve default) tanımlanmıştır?
    Bu iki farklı kelimenin amacı
    child classlardan bu methoda nasıl erişilebileceğini belirlemek içindir.
    static keyword kullanılırsa child classlardan bu methoda erişmek için
    InterfaceAdi.methodAdi yeterli olur.

    default keyword kullanılırsa methoda erişmek için obje oluşturulmalıdır.
     */

    public default void teker() {
        System.out.println("default... Tüm arabaların tekeri vardır");
    }

    public static void direksiyon() {
        System.out.println("static... Tüm arabaların direksiyonu vardır");
    }
}