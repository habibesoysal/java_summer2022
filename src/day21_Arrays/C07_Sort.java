package day21_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {

        int[] sayilar = {5, 7, 1, 5, 4, 7, 9};

        // Arrayi Arrays classını kullanarak natural sıralı hale getirebiliriz.

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));


    }
}
