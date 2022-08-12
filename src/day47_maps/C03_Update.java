package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.contains(key) ==> verdiğimiz keyin mapte olup olmadığını boolean olar döner.
        map.contains(value) ==> bir bütün olarak valuenun mapte olup olmadığını döner.
        ÖNEMLİ NOT: map.contains(value) valuenun içindeki bir parçayı bulmada işe yaramaz.
                    Eğer value içindeki bir parçayı aratmak istiyorsak map üzerinde manipulation yapmamız lazım.

        map.get(key) ==> verilen keye ait değeri döndürür.
         */

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("JDev")); // false

        // Verilen mapte JDev değerlerini JavaDeveloper olarak değiştirelim.
        // Maplerde replace tüm valueyu değiştirmek istersek kullanılabilir.
        // Kısmi değişikliklerde kullanamayız.

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        // Mapi güncellemek için key, yeniDegeri mape eklemeliyiz.
        // Örneğin key 101 için value Ali, Can, JDev
        // Güncelleme için sinifListMap.put(101, Ali, Can, JavaDeveloper)
        // Bunu yapabilmek için her bir keye ve ona ait valuya ihtiyacım olacak.

        Set<Integer> keySeti = sinifListMap.keySet();
        String eachValue;
        for (Integer each : keySeti) {
            eachValue = sinifListMap.get(each);
            eachValue = eachValue.replace("JDev", "JavaDeveloper");
            sinifListMap.put(each, eachValue);
            /*
            Biz keylerin tamamını aldık.
            Her bir keyin valuesunu getirdik.
            Value üzerinde değişikliği yapıp yeni halini put(key, yeniDeger) ile mape koyduk.
             */
        }
        System.out.println(sinifListMap);
    }
}