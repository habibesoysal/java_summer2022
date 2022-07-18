package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        // Başlangıç noktasından sonra
        // biriş şartına yaklaşmıyorsak sonsuz loop oluşur.

        /*
        for (int i = 0; i > -10; i++) {
            System.out.println(i);
        }
         */


        // Eğer ilk değer için bile bitiş şartı sağlanmıyorsa
        // for loop çalışır
        // ama loop bodysi hiçbir zaman devreye girmez.


        for (int i = 0; i > 5 ; i++) {
            System.out.println(i);
        }
    }
}
