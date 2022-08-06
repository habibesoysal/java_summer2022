package day42_abstractClass_interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI = 30;
    String ISIM = "Yıldız Koleji";
    /*
    Interface bir class değildir.

    Abstract classlar Javada abstraction (soyutlaştırma/kural koyma)
    işlevini yapıyordu. Ancak abstract bir classta abstract olmayan methodlar da olabilir.
    Bu da full abstraction yapmaya izin vermez.
    Eğer Javada içinde hiç concrete mehtod olmasın dediğimiz bir class oluşturmak istiyorsanız
    bunu class değil Interface yapmalısınız.

    1 - Interfacelerde concrete method olmaz.
    2 - Interfaceler full abstraction yaptığından dolayı Interfacelerden obje oluşturulamaz

    Hatırladığınız gibi Interface olan List'ten doğrudan obje oluşturamıyorduk.
    List<String> liste = new List<String>(); çalışmaz.

    Bunun yerine concstructor'ı List'in childı olan ArrayList'ten seçeriz.
    List<String> liste = new ArrayList<>();

    3 - Classlarda bir child birden fazla parent edinemez.
        Ancak Interfacelerde concrete method olmadığından dolayı
        biz her methodu child classta override etmek zorundayız.
        Override ederken kimin söylediğini override ettiğimizin önemi yoktur.

    4 - Interfaceler neyin yapılması gerektiğini söyler
        ama nasıl yapılacağına karışmaz.
     */

    List<String> liste = new ArrayList<>();

}