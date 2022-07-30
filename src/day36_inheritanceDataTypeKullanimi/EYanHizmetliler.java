package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe {
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan hizmetliler : " + (30 * saatUcreti * gunlukMesai) + " maaş alır");
    }

    protected void issizlikSigortasi() {
        System.out.println("Yan hizmetliler % 30 indirimli işsizlik sigortası yaptırabilir");
    }

    public static void main(String[] args) {
        /*
        Overriding child classtaki bir methodun
        parent classtaki aynı isimdeki methodu etkisiz hale getirerek
        kendisinin spesifik özelliğini ortaya çıkarmasıdır.

        Overriding'i nerede dikkate alıyoruz?
        Bir obje oluşturulken data türü ve cons farklı ise

        Eğer bir obje oluşturulurken data türü ve cons farklı ise
        objeşnin özelliklerini belirlerken 3 konuya dikkat çekmeliyiz
        1- Obje cons'ın olduğu classta oluşur.

        2- Objenin özelliklerini aramaya data türünün olduğu classtan başlarız
           bu classta aranan özellik bulunamazsa parenc classlara bakılır,
           orada da bulamazsak CTE verir.

        3- Aranan özellik Eğer aranan özellik variable ise bulduğumuz ilk değeri yazdırırız.
           Aranan özellik method ise değeri yazdırmadan önce override diye kontrol etmemiz gerekir.
           Eğer override edildiyse en güncel değeri yazdırırız.
         */

        BMuhasebe yh1 = new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai); // M 8
        System.out.println(yh1.saatUcreti); // M 10
        yh1.maas(); // YH Yan hizmetliler : 2160 maaş alır
        yh1.ozelSigorta(); // M
        yh1.sigorta(); // P
        System.out.println(yh1.isim); // P
        System.out.println(yh1.soyIsim); // P
        System.out.println(yh1.departmant); // P
        // System.out.println(yh1.issizlikSigortasi);
        // Aramaya muhasebeden başladığımızdan
        // issizlikSigortasi bulamadım CTE
    }
}