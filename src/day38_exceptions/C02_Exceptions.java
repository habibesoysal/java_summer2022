package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {

            /*
            try bloğu yapmaya çalıştığımız ama risk olduğunu düşündüğümüz
            işlemleri yazmak için kullanılır.

            catch'den sonraki parantez karşılaşmayı beklediğimiz
            exception türünü Javaya söylemek için kullanılır.

            catch bloğu : Javaya söylediğimiz exception gerçekleşirse
            Javanın yapmasını istediğimiz işlem.

            catch bloğunun önündeki paranteze karşılaşmayı beklediğimiz
            exception'ı yazabilir veya her türlü exception'da devreye girmeye istiyorsak
            tüm exception'ların parent'ı olan Exception yazabiliriz.
             */

            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Payda 0 oldu, dikkatli ol");
            }
            b--;
            sayac++;
        }
    }
}