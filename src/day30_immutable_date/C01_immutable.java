package day30_immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_immutable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Kenan");
        list.add("Enes");
        list.add("İsmail");
        System.out.println(list); // [Kenan, Enes, İsmail]

        list.set(1,"Yasemin");
        System.out.println(list); // [Kenan, Yasemin, İsmail]

        list.remove("İsmail");
        System.out.println(list); // [Kenan, Yasemin]
    }
}