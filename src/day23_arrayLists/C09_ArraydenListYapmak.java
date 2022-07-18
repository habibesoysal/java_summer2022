package day23_arrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

        /*
        List ile çalışırken en kötü özelliği
        elemanları tek tek eklemek.
         */

        Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};
        /*
        Bu kadar çok elemanlı bir listeyi
        tek tek eleman olarak girmek yerine
        array oluşturup for loop ile
        oluşturduğumuz list'e taşıyabiliriz.
         */
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        Bu işlemi yapması için Javanın oluşturduğu bir method da var.
        Ancak bu yöntemin çok yan etkisi var.

        1) Bu şekilde oluşturulan listede add, remove gibi size'ı değiştiren methodlar KULLANILAMAZ.
        2) asList methodu ile oluşturulan liste ve kaynak olan array
           birbiri ile ilişik olarak hayatlarına devam ederler.
           Birinde yapılan değişiklik otomatik olarak diğerine de işler.
         */

        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        /*sayilar2.add(5);
        System.out.println(sayilar2);
        exception verdiği için yoruma aldık.
         */

        arr[0] = 20;
        System.out.println(Arrays.toString(arr)); // [20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        System.out.println("Arrayda değişiklik yapınca sayilar2 : " + sayilar2);
    }
}