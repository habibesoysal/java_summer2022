package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsın");

        sb.append("?");

        System.out.println(sb); // Java daha ne yapsın?

        // append istediğimiz String'in en sona ekler.

        sb.append("Java",2,4);
        System.out.println(sb); // Java daha ne yapsın?va

        sb.insert(4, " her şeyi düşünmüş,");
        System.out.println(sb); // Java her şeyi düşünmüş, daha ne yapsın?

        // araya ekleme yapmak istediğimizde append değil insert kullanmalıyız.

        sb.insert(22,"valla valla", 5,11); // Java her şeyi düşünmüş valla, daha ne yapsın?
        System.out.println(sb); // Java her şeyi düşünmüş valla, daha ne yapsın?
    }
}