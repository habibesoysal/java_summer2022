package day18_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
        9'dan 190'a kadar 7'nin katı olan sayıları yazdırın.
         */

        int bas = 9;
        int bitis = 190;
        int temp = bas;

        // While Loop ile

        while (temp < bitis) {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }

        // Do while Loop ile
        System.out.println("");
        temp = bas;
        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        } while (temp < bitis);
    }
}
