package day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve rakamları toplamını yazdırın.
         */

        int input = 5432;

        int rakamlarToplami = 0;
        int birler = 0;
        int temp = input;

        while (temp > 0) {
            birler = temp % 10;
            rakamlarToplami += birler;
            temp /= 10;
        }
        System.out.print(input + " sayısının rakamlar toplamı : " + rakamlarToplami);
    }
}
