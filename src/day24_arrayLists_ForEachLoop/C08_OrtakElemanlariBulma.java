package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtakElemanlariBulma {
    public static void main(String[] args) {
        // Soru 3:
        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
        //each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String[] arr1 = {"Ali", "Veli", "Can", "Ayşe"};
        String[] arr2 = {"Ali", "Hasan", "Ayşe", "Enes"};

        List<String> ortakIsımler = new ArrayList<>();

        for (String each1 : arr1
        ) {
            for (String each2 : arr2
            ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsımler.add(each1);
                }
            }
        }
        if (ortakIsımler.isEmpty()) {
            System.out.println("Hiç ortak eleman yok");
        } else {
            System.out.println("Her iki arraydeki ortak isimler : " + ortakIsımler);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}