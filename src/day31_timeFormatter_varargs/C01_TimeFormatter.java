package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("İlk oluşturulan tarih : " + tarihSaat);
        // İlk oluşturulan tarih : 2022-07-25T21:40:39.895389400

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");
        System.out.println(dtf.format(tarihSaat)); // 25/7/22 09:45

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat)); // 25/Tem/2022 21:46
    }
}