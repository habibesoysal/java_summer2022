package day15_overloading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {

        topla(5, 7); // 12
        topla(5.2,3); // 8.2,
        topla(3.4,6.1); // 9.5
        topla(5,6.2); // 11.2

        // !!!!!! BUNLAR ARGUMENT !!!!!

    }

    /*
    Java hangi methodun çalışacağına karar verirken optimizasyon uygular.
    Eğer hiç cast yapmadan kullanabileceği bir method varsa onu kullanır.
    Eğer cast yapmadan kullanabileceği bir method yoksa en az cast yaparak kullanabileceği methodu seçer.
     */

    public static void topla(int sayi1, int sayi2) {  // !!!! BUNLAR PARAMETRE !!!!
        System.out.println("İki int'ın toplamı : " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("Bir double ve bir int'ın toplamı : " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("İki double'ın toplamı : " + (sayi1 + sayi2));
    }
}
