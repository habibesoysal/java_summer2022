package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]

        // listedeki tüm elementleri index kullanmadan 3 artırın
        for (Integer each : liste) {
            each += 3;
            System.out.print(each + " ");
        }
        System.out.println("");
        System.out.println(liste);

        /*
        Java index yapısı olmayan ceollectionlardaki elementlere ulaşmak veya onları değiştirmek için
        iterator interface'ini oluşturmuştur.

        Iterator interface olduğundan ondan obje üretmemiz mümkün değildir.
        Bunun yerine bize iterator döndüren liste.iterator() methodunu kullanıyoruz.
         */

        System.out.println(liste); // [10, 20, 30]

        Iterator it1 = liste.iterator();
        System.out.println(it1.next()); // 10
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30

        // Iteratorda geri dönüş yok. Adım adım sona ulaştıktan sonra
        // başa gelmek isterseniz yeniden bir iterator oluşturmanız gerekir.

        Iterator it2 = liste.listIterator();
        // Yeni iterator'ı kullanarak listenin tüm elementlermini silelim.
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste); // Iterator ile elementleri gezip remove yapınca
                                  // liste kalıcı olarak değişti.

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Yeniden liste : " + liste);
        Iterator it3 = liste.listIterator();
        while (it3.hasNext()) {
            it3.next();
            it3.remove();
        }
        System.out.println("Looptan sonra liste : " + liste);

        /*
        Görüldüğü gibi Iterator kullanarak yapabildiğim
        1 - Tüm collection elementlerini yazdırmak
        2 - Tüm collection elementlerini silmek
         */
    }
}