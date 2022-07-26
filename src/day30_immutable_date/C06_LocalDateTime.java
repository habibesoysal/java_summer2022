package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat); // 2022-07-23T19:39:52.906849300

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 2022-10-27T23:41:57.585413

        System.out.println(tarihSaat.minusDays(100).minusMinutes(100)); // 2022-04-14T18:02:41.700346800

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); // 2022-04-18T23:43:13.662812300

        System.out.println(tarihSaat.toLocalDate()); // 2022-07-23
    }
}