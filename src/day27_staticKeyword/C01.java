package day27_staticKeyword;

public class C01 {
    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {

        /*
        class levelda 2 tür variable oluşturabiliriz :
        1) static (class) variable
        2) instance (object) variable

        static variable'lar tüm classtan kullanılabilirken
        instance olanlar sadece static olmayan methodlarda doğrudan kullanılabilir.
        instance variable'lara static methoddan ulaşmak istersek
        obje oluşturmamız gerekir.

        * instance variable'lar obje variable'ı olduğu için
        herhangi bir satırda instance variable'ın değerinin ne olduğunu bulmak için
        OBJE OLUŞTURULAN SATIRDAN itibaren kod incelenmelidir.

        * static variable'lar class variable'ı olduğu için
        herhangi bir satırda static variable'ın değerinin ne olduğunu bulmak için
        CLASS BAŞINDAN itibaren kod incelenmelidir.
         */

        C01 obj1 = new C01();
        System.out.println("obj1'in rakam değeri : " + obj1.rakam); // 5
        System.out.println("obj1'in sayı değeri : " + sayi); // 10

        obj1.rakam += 1; // 5 + 1 = 6
        sayi += 1; // 10 + 1 = 11

        System.out.println("1 artırdıktan sonra obj1'in rakam değeri : " + obj1.rakam); // 6
        System.out.println("1 artırdıktan sonra obj1'in sayı değeri : " + sayi); // 11

        C01 obj2 = new C01();

        System.out.println("obj2'in rakam değeri : " + obj2.rakam); // 5
        System.out.println("obj2'in sayı değeri : " + sayi); // 11

        obj2.rakam++; // 5 + 1 = 6
        obj2.sayi++; // 11 + 1 = 12

        System.out.println("1 artırdıktan sonra obj2'in rakam değeri : " + obj2.rakam); // 6
        System.out.println("1 artırdıktan sonra obj2'in sayı değeri : " + sayi); // 12
    }
}