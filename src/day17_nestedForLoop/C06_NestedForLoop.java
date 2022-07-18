package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen String'i aşağıdaki gibi yazdıran bir program yazın.

        input : "DENİZ"

        D
        DE
        DEN
        DENİ
        DENİZ
        */

        String input = "DENİZ";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j-1,j)); // ilk harfi için substring(0,1) olmalı
            }
            System.out.println("");
        }
    }
}
