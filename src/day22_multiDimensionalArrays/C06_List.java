package day22_multiDimensionalArrays;


import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        Arrayi array yapan sembol [] idi.
        arrayList de ise <> (diamond) kullanılır.
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        // bir list'e eleman eklemek istersek
        isimler.add("Başak");

        System.out.println(isimler.add("Ayşe")); // true döner


        /*
        Stringde bir method çalıştırdığımızda
        assign yapmazsak String değişmiyordu.

        String isim = "Süleyman";
        isim.toUpperCase(); // SÜLEYMAN
        sout(isim) --> Süleyman

         */

        System.out.println(isimler); // [Başak, Ayşe]

        /*
        List'in tek kötü tarafı array altyapısını kullandığı için
        elemanları birer birer eklemek zorunda olmamızdır.
         */
    }
}