package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        // Queue kuyruk demektir, sıra önemlidir.
        // Gelen sona gelir, giden baştan gider.

        System.out.println(ll3); // [Adem, Zeynep, Hpolat, Kadir],

        System.out.println(ll3.remove()); // Adem
        System.out.println(ll3); // [Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove("Hpolat")); // true
        System.out.println(ll3); // [Zeynep, Kadir]

        System.out.println(ll3.element()); // Zeynep
        System.out.println(ll3.peek()); // Zeynep

        Queue<String> ll4 = new LinkedList<>();

        // System.out.println(ll4.element()); // NoSuchElementException
        System.out.println(ll4.peek()); // null
        // peek() ve element() silmeden ilk elementi bize döndürür.
        // Aralarındaki fark boş liste olursa peek() null döner, element exception fırlatır.

        ll3.offer("Ahmet");
        ll3.offer("Sefa");
        System.out.println(ll3); // [Zeynep, Kadir, Ahmet, Sefa]

        System.out.println(ll3.poll()); // Zeynep
        System.out.println(ll3); // [Kadir, Ahmet, Sefa]

        // System.out.println(ll4.remove()); // NoSuchElementException
        System.out.println(ll4.poll()); // null
    }
}