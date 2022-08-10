package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collections <dataTuru>'nü Object seçmeniz durumunda
        Collection'a farklı data türlerinden objeler koymanıza izin verir.
        Bu depolama açısından bize esneklik sağlar.
        Ancak işlem yaparken tüm objeleri Object olarak tanımladığımız için
        çok fazla casting yapmamız gerekebilir.
         */

        List<String> liste = new ArrayList<>();
        // liste.add(5);
        // liste.add('s');
        // liste.add(true);

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");

        System.out.println(list); // [5, s, true, Ali]
        list.set(0, (Integer) list.get(0) + 5);
        list.set(3, list.get(3) + " Can");
        list.set(2, !(Boolean)list.get(2));

        System.out.println(list); // [10, s, false, Ali Can]

        Set<Object> set1 = new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
    }
}