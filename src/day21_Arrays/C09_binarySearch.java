package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*
        binarySearch methodu sıralanmış arrayde aradığımız elementin indeksini döndürür.

        Ya aradığımız element arrayde yoksa?
        (Stringde indexOf bize olmayan elementler için -1 döndürüyordu)

        Aradığımız element arrayde yoksa Java hem olmadığını
        hem de olsaydı nerede olacağını bize döndürür.

        Olmadığını ifade için - (eksi) kullanır.
        Olsaydı nerede olacığını belirtmek için indeks değil sıralama kullanır.
         */

        int[] sayilar = {3, 7, 15, 4, 27, 10};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 7, 10, 15, 27]
        // Varsa indeks yoksa -sıra

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1

        System.out.println(Arrays.binarySearch(sayilar,15)); // 4

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1
    }
}