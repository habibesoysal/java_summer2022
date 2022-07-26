package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable : değiştirilemez
        mutebal   : değiştirilebilir

        En meşhur immutable class : String
         */

        String str = "Yıldız Bank";

        System.out.println(str.toUpperCase()); // YILDIZ BANK

        str.toLowerCase();

        System.out.println(str); // Yıldız Bank

        str.substring(3,5); // sout olsaydı di olurdu

        System.out.println(str); // Yıldız Bank

        // Javada String gibi metinsel ifadelerde kullanabileceğimiz mutable StringBuilder classı da vardır.

        StringBuilder sb =  new StringBuilder("Java Bank");

        System.out.println(sb); // Java Bank

        sb.reverse();

        System.out.println(sb); // knaB avaJ

        sb.append(".");

        System.out.println(sb); // knaB avaJ.

    }
}