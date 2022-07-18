package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {

        // bir önceki swap sorusunu boş kova kullanmadan yapalım

        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println("Değişimden önce" + " " + "Sayi1:" + sayi1 + " " + "," + " " + "Sayi2: " + sayi2);

        sayi1 = sayi1 + sayi2; // 30 20
        sayi2 = sayi1 - sayi2; // 30 10
        sayi1 = sayi1 - sayi2; // 20 10

        System.out.println("Değişimden sonra sayıların değerleri \nSayı1: " + sayi1 + " " + "Sayı2: " + sayi2);


    }
}
