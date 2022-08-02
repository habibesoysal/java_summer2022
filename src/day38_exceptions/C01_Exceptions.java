package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        Bir sprunla karşılaşmayı beklediğiniz noktalarda
        if else ile sorunu yakalayıp onunla ilgili çözüm üretebilirsiniz.
        Ama sorunu her zaman if else ile çözemeyeceğimizden dolayı
        Java try-catch blocklar oluşturmuştur.
         */

        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {
            if (b == 0) {
                System.out.println("İşlem yapılırken payda 0 oldu, dikkat etmelisiniz");
            } else {
                System.out.println(a / b);
            }
            b--;
            sayac++;
        }
    }
}