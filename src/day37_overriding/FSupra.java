package day37_overriding;

public class FSupra extends EToyota {


    void yakit() {
        System.out.println("Supra benzin kullanır");
        /*
        Private methodlar override edilemez.
        Eğer child classta parent classtaki private method ile
        aynı signature'da bir method oluşturursanız
        bu overriding method olmaz.
        */
    }

    @Override
    void motor() {
        /*
    @Override notasyonu Javaya bir görev verir.
    Java bu notasyonla birbirine bağlı olan iki methodu
    sürekli kontrol eder. Eğer parent classtaki overridden methodu
    silerseniz CTE verir.

    @Ovveride notasyonu kullanmak mecburi değildir.
    Eğer Overridding method silinirse kodun CTE vermesini
    istersek @Override notasyonu kullanmalıyız.
     */
    }
}