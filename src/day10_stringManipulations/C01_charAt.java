package day10_stringManipulations;

public class C01_charAt {
    public static void main(String[] args) {

        String str = "Java öğrenmek ne güzel";

        System.out.println(str.charAt(0)); // İlk harfi alı J

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21)); // l

        // System.out.println(str.charAt(22));
        // Son harfi bulmak için str'ın uzunluğunun bir eksiğini index olarak gireriz.
        // Eğer index olarak uzunluğu veya daha büyük bir sayı girersek Java exception verir.

        // charAt methodu kullandığımızda sonuç char olacağı için artık manipulation yapamayız.
        // String methodlarından kullanmamız gereken bir method varsa
        // charAt'ten önce kullanmalıyız.

    }
}
