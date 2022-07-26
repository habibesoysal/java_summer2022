package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Birden fazla element içeren array ve arrayList gibi yapılarda
        passByValue geçerlidir.

        Eğer methodda array veya list'in kendisi değiştirilirse passByValue özelliği
        sebebiyle Java değişen değeri değil array veya list'in orijinal değerini alır.

        Ancak array veya list değiştirilmeden
        sadece içindeki elemanlar değiştirilirse
        Java obje değişmediği için (referans aynı)
        aynı array veya list'i bize döndürür ancak içindeki elementleri değişmiş olacaktır.
         */

        /*
        Verilen 4 elemanlı bir arrayi
        methoda gönderelim.
        Method'da yeni 3 elemanlı bir array atayıp
        bu yeni arraye rastgele 100'den küçük 3 sayı atayalım.
        Method'da arrayi yazdıralım.
        Main mehtodda da method calldan sonra yeniden methodu yazdıralım.
         */

        int[] arr = {3, 5, 8, 10};

        arrayiDegistir(arr);

        System.out.println("Method calldan sonra main methodda array : " + Arrays.toString(arr));
    }

    public static void arrayiDegistir(int[] arr) {

        arr = new int[3];

        Random rnd = new Random();
        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Methodda array : " + Arrays.toString(arr));

    }
}