package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {

       /* 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        Orn     : sayi1=10 ve sayi2=20;
        kod calistiktan sonra
                sayi1=20 ve sayi2=10

        */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0; // geçici kova

        // adım 1) sayi2'yi geçici kovaya koyalım

        sayi3 = sayi2; // sayi1=10, sayi2=20, sayi3=20

        // adım 2) birinci sayıyı ikinci sayıya atayalım

        sayi2 = sayi1; // sayi1=10, sayi2=10, sayi3=20

        // adım 3) geçici kovadaki sayıyı sayi1'e atayalım

        sayi1 = sayi3; // sayi1=20, sayi2=10, sayi3=20

        System.out.println("swaptan sonra sayi1 : " + sayi1);
        System.out.println("swaptan sonra sayi2 : " + sayi2);


    }
}
