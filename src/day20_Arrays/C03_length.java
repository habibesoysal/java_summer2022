package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki şekilde Array oluşturabiliriz
        int sayilar[] = {1, 2, 3};

        String harfler[] = new String[4];

        System.out.println("sayilar Array'inin uzunluğu : " + sayilar.length); // 3
        // String length() methodunda parantez var, Array'de yok.

        System.out.println("harfler Array'inin uzunluğu : " + harfler.length); // 4
        System.out.println(Arrays.toString(harfler));

        // harfler Array'inin son elementini yazdıralım.
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); // ArrayIndexOutOfBoundsException



    }
}
