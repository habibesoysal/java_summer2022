package day22_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /*
       Tek katlı arraylerde arrayi doğrudan yazdıramıyoruz.
       Çünkü array non-primitive data türüdür ve her non-primitive data doğrudan yazdırılamayabilir.

       Ancak arrayin içerisindeki elementleri doğrudan yazdırabiliyorduk.
       Çünkü genelde primitive data türü veya String elementler kullanılıyordu.

       Multi-dimensional arraylerde en dikkat edeceğimiz konu
       ulaşmak istediğimiz elementin bir array mi yoksa primitive data mı olduğudur.
       */

        int[][] sayilar = {{1, 2, 4, 5}, {3, 4}};

        /*
        Burada sayilar arrayini düşünürsek 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]

        Ancak en içerideki elementlere ulaşırsak doğrudan yazdırabiliriz.
         */

        System.out.println(sayilar[0]); // [I@6442b0a6 (referans)
        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]); // 2
        System.out.println(sayilar[1][0]); // 3

        System.out.println(Arrays.toString(sayilar)); // [[I@6442b0a6, [I@60f82f98]
        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]

        /*
        Arrayi 2 şekilde declare edebiliriz:
        1) elemanları doğrudan yazabiliriz. Örn: int[][] sayilar = {{1, 2, 4, 5}, {3, 4}};

        2) outer ve inner arraylerin uzunluklarını belirterek oluşturabiliriz. Örn: int [][] sayilar new int [3][4]

        Ancak 2. yöntemi kullandığımızda inner arraylerin farklı uzunlukta olma ihtimali kalmaz.
        Bu örnek için outer arrayin 3 tane inner arrayi vardır.
        Her bir inner arrayin ise dörder elemanı vardır.

        Eğer inner arrayleri farklı uzunlukta oluşturmak istersek
        mecburen birinci yöntemi kullanmalıyız.
         */
    }
}