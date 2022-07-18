package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
            /*
            While loop'ta önce kontrol edip sonra işlem yaptığımız için
            işlem bittikten sonra loopun kırılması için bir kez daha
            başa dönmemiz gerekiyor. Bu durumda fazladan bir işlem yapılıyor.
             */
        int sayi = 7;

        while (sayi < 10) {
            System.out.println(sayi);
            sayi++;
        }

        /*
        Do while loop ile çalıştığımızda bu dezavantaj ortadan kalkar.
         */

        sayi = 7;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi < 10);
    }
}

