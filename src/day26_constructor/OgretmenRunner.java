package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("Öğretmen1 " + ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Emre", "Akdoğan", "1/1/2001", "Matematik", "Fizik");
        System.out.println("Öğretmen2 " + ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Cavidan", "Kabınkara", "1/1/1991");
        System.out.println("Öğretmen3 " + ogretmen3);
    }
}