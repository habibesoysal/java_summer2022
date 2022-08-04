package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);
        Değer ataması yapmadan bir variable'ı kullanmaya çalışırsanız
        Java Compile Time'da bunu fark eder ve size izin vermez.
         */

        str = null;
        // System.out.println(str.length());
        // NullPointerException

        Object obj = "Java Java Java";
        Integer sayi = (Integer) obj; // ClassCastException

        /*
        String str2 = "Hava Civa";
        Integer sayi2 = str2;
        Java bazı casting işlemlerine compile time'da izin vermez.
        Ancak bazen syntax uygun olabilir, bu durumda Java kodun çalışmasına itiraz etmez.
         */

        Thread.sleep(5000);
    }
}