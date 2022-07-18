package day20_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {
        
        int sayi = 10;

       // System.out.println(sayiMethod); sayiMethod, method1'de oluşturulmuş local bir variable'dır.

        for (int i = 10; i < 20 ; i++) {
            System.out.println(i);
        }

        // System.out.println(i); i, loopta oluşturulmuş local bir variable'dır
        // sadece loop içerisinde kullanılabilir.

         // static int sayiStatic = 10; static keyword sadece class levelda kullanılabilir.
        // methodların içerisinde static variable tanımlanamaz.
    }
    
    public static void method1() {
        // System.out.println(sayi); sayi, main mathodda oluşturulmuş local bir variable'dır.
        // ve sadece main methodda geçerlidir.
        
        int sayiMethod = 20;
    }
}
