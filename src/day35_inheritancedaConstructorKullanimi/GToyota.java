package day35_inheritancedaConstructorKullanimi;

public class GToyota {

    GToyota() {
        System.out.println("GToyota parametresiz cons");
    }

    GToyota(String isim) {
        // super(isim); extends olmadığı için super(); cons call'u Java kabul etmez.
        System.out.println("GToyota parametreli cons");
    }
}