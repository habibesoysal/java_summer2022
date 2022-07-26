package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java her zaman güzel");

        sb.delete(8, 9);
        System.out.println(sb); // Java herzaman güzel

        sb.deleteCharAt(8);
        System.out.println(sb); // Java heraman güzel

        // Baştan başlayarak her loopta son harfi silip kalanı yazdıralım.

        int son = sb.length();
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}