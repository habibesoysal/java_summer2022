package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 1'den 5'e kadar (5 dahil) olan tam sayıları toplayalım.

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            toplam += i;
        }

        System.out.println("1 ile 5 arası sayıların toplamı : " + toplam);

        // 10 ve 20 dahil aradaki sayıları toplayalım.

        toplam = 0;

        for (int i = 10; i <= 20; i++) {
            toplam += i;
        }
        System.out.println("10 ile 20 arası sayıların toplamı : " + toplam);

        // 30 dahil 50 dahil aradaki çift sayıları toplayalım

        toplam = 0;

        for (int i = 30; i <= 50; i += 2) {
            toplam += i;
        }
        System.out.println("30 - 20 arası çift sayıların toplamı : " + toplam);

        // 2. Yöntem
        toplam = 0;

        for (int i = 30; i <= 50; i += 2) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
        System.out.println("30 - 20 arası çift sayıların toplamı : " + toplam);

        // 1500 ile 1600 (sınırlar dahil) arasında 7 ile bölünebilen sayıları toplayalım.
        toplam =0;

        for (int i = 1500; i <= 1600 ; i++) {
            if (i %7 == 0) {
                toplam+=i;
            }
        }
        System.out.println("1500 ile 1600 arasında 7 ile bölünebilen sayıları toplamı : " + toplam);

    }
}
