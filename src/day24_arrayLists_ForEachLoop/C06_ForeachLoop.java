package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        int[] arr = {2,3,4,6,23,6,8,9,1};
        List<Integer> liste = new ArrayList<>();

        // Arraydeki tüm elemanları inceleyelip tek sayı olanları list'e atayalım.

        for (int each: arr // gelecek dataların türü, loop içinde ne isim verileceği : ve nereden alındığı
             ) {

            if (each % 2 != 0){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}