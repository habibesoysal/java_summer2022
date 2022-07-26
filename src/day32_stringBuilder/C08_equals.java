package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(sb1)); // true
        // StringBuilder'da equals methodu ancak aynı obje olursa true döner.
        // Strin'deki gibi düşünmemek lazım.

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3)); // -4

        /*
        compareTo() methodu iki StringBuilder'ı baştan başlayarak harf harf karşılaştırır.
        İlk harfler aynı ise ikincilere geçer.
        İkinciler aynı ise üçüncülere geçer ve
        ilk farklı olan harfe kadar gider.
        Farklı olan iki harfin ASCII kodları arasındaki farkı verir.

        Eğer hiç farklı harf yoksa sonuç olarak 0 döndürür.
         */
    }
}