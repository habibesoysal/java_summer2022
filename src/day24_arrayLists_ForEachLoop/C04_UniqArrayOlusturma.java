package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqArrayOlusturma {
    public static void main(String[] args) {
        // Soru 2) Verilen bir array’deki tekrar eden elementleri tek bir defa barındıran
        // yeni bir array olarak donduren bir method olusturun

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5};

        int[] uniqArray = uniqArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqArray));
    }

    public static int[] uniqArrayOlustur(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]
        List<Integer> benzersizList = new ArrayList<>();

        // Yanındaki elemente eşit olmayanları listeye ekliyor.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                benzersizList.add(arr[i]);
            }
        }

        // Son elementi kontrol edip yoksa listeye ekliyoruz.
        if (!benzersizList.contains(arr[arr.length - 1])) {
            benzersizList.add((arr[arr.length -1])); // [1, 2, 3, 4, 5, 6, 9]
        }

        // benzersiz list ==> 1, 2, 3, 4, 5, 6, 9
        // Benzersiz listenin size bilgisini kullanarak bir array oluşturduk.
        int[] tekrarsizArr = new int[benzersizList.size()];


        // benzersiz listedeki tüm elemanları yeni arraye atadık.
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);
        }

        // Oluşturduğumuz yeni arrayi main methoda döndürdük.
        return tekrarsizArr;
    }
}