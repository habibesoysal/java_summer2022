package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        Bazen tek değişken sorunu çözmeye yetmez.
        *
        **
        ***
        ****
        *****
         */

        // Yan yana 3 tane * yaz

        for (int i = 1; i <= 3; i++) {
            System.out.print("* ");
        }

        System.out.println("");

        // Yan yana 3 tane * yaz
        for (int i = 1; i <= 4; i++) {
            System.out.print("* ");

        }

        System.out.println("");

        // Bu tür durumlarda içiçe (nested) loop kullanmak gerekir.

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
