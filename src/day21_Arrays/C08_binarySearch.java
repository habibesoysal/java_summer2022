package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        binarysearch Javada eleman aramanın kısa yoludur.
        Ancak binarysearch'ün çalışması için önce Arrayin sıralı hale getirilmesi gerekir.
        Eğer sıralama yapmadan binarysearch yaparsak sonucu bulamayabilir
        veya yanlış bulabilir.
         */

        String[] harfler = {"Y", "B", "D", "G", "O", "A"};

        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler, arananHarf));
        C03_Contains.contains(harfler,arananHarf);
        System.out.println(C03_Contains.contains(harfler,arananHarf));

        // binarySearch bize aradığımız elemanın indeksini döndürür.
        // Array sıralı olmadığı için arama sonucunu doğru bulamayabilir.
        // Emin olmak için önce sort yapmalıyız.

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
    }
}