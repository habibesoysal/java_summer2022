package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() methodu bir Array methodu değil String methodudur.
        Ama Array döndürdüğü için bu konuda anlatıyoruz.

        split() ile herhangi bir Stringi istediğimiz parçalara bölüp bir Array haline getiriyoruz.
         */

        String str = "Java ne kadar güzel";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, güzel]

        String[] kelimelerNe = str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // [Java ,  kadar güzel]

        String[] kelimelerE = str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); // [Java n,  kadar güz, l]

        String[] kelimelerA = str.split("a");
        System.out.println(Arrays.toString(kelimelerA)); // [J, v,  ne k, d, r güzel]

        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler)); // [J, a, v, a,  , n, e,  , k, a, d, a, r,  , g, ü, z, e, l]
    }
}