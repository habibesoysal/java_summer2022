package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str3); // false

        System.out.println("s1 - s4 " + str1.equals(str4)); // true
        System.out.println("s1 - s4 " + (str1 == str4)); // true

        /*
        Yeni bir String oluştururken :

        1) Eşitliğin sağında new keyword'u olursa Java doğrudan yeni bir obje ve referansını oluşturur.

        2) Eğer eşitliğin sağında bir method çalışıyor veya + işlemi yapılıyorsa String immutable olduğundan
        değişikliği kaydetmek üzere hemen bir kopya String ve referansını oluşturur, sonra değeri hesaplayıp
        bu yeni kopya objenin içine koyar.
         */

        String str5 = "Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5)); // true
        System.out.println(str5 == str1); // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1 == str6); // true

        System.out.println(str5.equals(str6)); // true
        System.out.println(str5 == str6); // true

        /*
        Eğer yeni String objesi oluşturulurken
        new kelimesi kullanılmaz veya
        eşitliğin sağında + işlemi olmazsa Java bakar.

        Eğer daha önce oluşturulan String objelerden (String havuzu)
        bire bir aynı String varsa
        o objeyi ve referansını kullanır,
        bire bir aynısı yoksa yeni bir obje ve referans oluşturur.
        */
    }
}