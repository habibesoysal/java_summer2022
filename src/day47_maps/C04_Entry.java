package day47_maps;

import day46_maps.ReusableMethods;


import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        /*
         Java Entry<Key, Value> mapin içerisinde bulunan her bir kaydı
         Key = Value şeklinde tutar. Dolayısıyla herhangi bir Entry'e ulaştığımızda
         hem keye hem de valueya ulaşabilir ve istediğimiz işlemleri yapabiliriz.

         entry.getKey() bize keyi getirir.
         entry.getValue() bize valueyu getirir.
         entry.setValue() valueyu istediğimiz değer olarak uptade eder.
         */

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        // Mapin her bir elemanını alt alta yazdırın.

        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifListMap.entrySet();
        for (Map.Entry<Integer, String> each : sinifEntrySet) {
            System.out.println(each);
        }

        // Mapin tüm elemanlarında varsa Tester kurs ismini QA olarak değiştirelim

        String eachValue;
        for (Map.Entry<Integer, String> each : sinifEntrySet ) {
            eachValue = each.getValue();
            eachValue = eachValue.replace("Tester", "QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);
    }
}