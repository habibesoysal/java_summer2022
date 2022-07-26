package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 19:11:49.234840700
        /*
        Bizim oluşturduğumuz date ve time
        canlı saat veya tarih değildir.
        LocalTime.now() kullandığımız satırda
        o anki tarih veya saati alıp
        bizim variable'ımıza store eder.
        time1 variable'ının değeri sabittir.
         */

        Thread.sleep(3000);

        time1 = LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getSecond());

        System.out.println(time1.plusSeconds(10000));

        System.out.println(time1.minusMinutes(200));

        System.out.println(time1.withHour(3)); // saati 3 yapıp yazdırdı.
    }
}