package day29_passByValue_immutable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemanlı bir array oluşturalım.
        Sonra ayrı bir methodda
        bu arrayin 2. ve 4. elemanlarını
        100'den küçük rastgele bir sayı ile değiştirelim
        ve yeni halini yazdıralım.
         */

        int[] arr = {5, 7, 8, 10};

        elemanDegistir(arr);

        System.out.println("Main methodun içinde diğer method çalıştıktan sonra : " + Arrays.toString(arr));
        // [5, 7, 8, 10]
    }

    public static void elemanDegistir(int[] arr) {

        Random rnd = new Random();
        arr[1] = rnd.nextInt(100);
        arr[3] = rnd.nextInt(100);

        System.out.println("Methodun içinde : " + Arrays.toString(arr)); // [5, 49, 8, 9]
    }
}
