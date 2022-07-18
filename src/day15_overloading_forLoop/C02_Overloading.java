package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        Javada oluşturduğumuz methodların isminin yaptığı işlem ile uyumlu olmasını isteriz.
        Mesela bir String'in bir bölümünü almak için
        Java 2 adet substring() methodu veya
        verilen String'deki bazı parçaları yenileriyle değiştirmek için
        2 adet replace() methodu oluşturmuştur.

        Java aynı isimde birden fazla method varsa
        hangisinin kullanılacağına parametre sayısı ve
        parametrelerin data türüne göre karar verir.
         */

        String str = "Bu Java öğrenilecek, başka yolu yok";
        str.substring(2);
        str.substring(2,4);

        str.replace('c' , 'v');
        str.replace("J", "H");

        /*
        Aynı isimde ama farklı methodları oluşturmak için
            değiştirebileceğimiz şeyler:
            1- Parametre sayısı
            2- Aynı sayıda parametreye sahip olsa bile parametrelerin data türleri
            3- Aynı sayıda ve aynı data türünde parametrelere sahip methodlarda parametrelerin sıralanışı
         */


    }
}
