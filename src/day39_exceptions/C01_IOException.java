package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Javadan bilgisayarımızdaki bir dosyaya erişmek istiyorsak
        FileInputStream classından yardım alırız.
        Aynı şekilde Javadan bilgisayarımızdaki bir dosyaya ekleme veya uptade
        yapmak istersek FileOutputStream classından yardım alırız.
         */

        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        Görüldüğü gibi compile time'da altını kırmızı çizen her durum
        Compile Time Error değildir.
        Javada bazı exceptionlar da Compile Time Exception'dır.
        Özellikle dosya okuma ve yazma ile ilgili exceptionlar
        Compile Time Exceptiondır.

        Compile Time Exception oluştuğunda Java çözüm için 2 ihtimal önerir:
        1- try-catch ile çevrelemek
        2- method signature'ına throws keyword ile beklenen exception türünü yazmak

        throws exception sadece olayın farkında olduğumuzun deklarasyonudur.
        exception'ın handle edilmesinde hiçbir rolü yoktur.
        Yani try-catch ile kontrol altına aldığımız exceptionlarda
        kod çalışmaya devam ediyordu.
        Ancak throws exception yazdığımızda Java bir exception ile karşılaşırsa
        hiçbir şey yapmamışız gibi hata mesajı yayınlayıp çalışmayı durdurur.
         */
    }
}