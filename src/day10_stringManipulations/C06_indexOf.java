package day10_stringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Java öğrenmek çok güzel";

        System.out.println(str.indexOf("ö")); // 5
        System.out.println(str.indexOf('ğ')); // 6
        System.out.println(str.indexOf("t")); // Bana int döndürür.
                                              // int'te yok diye bir değer bulunmaz.
                                              // Negatif bir değer dönerse aranan değerin str'da olmadığı anlaşılır.
                                              // Java -1 döndürmeyi tercih etmiştir.


        String str5 = "qerjpwojıfşldşkbşsfmagsalfşgşaf;lkfdskfa";

        // str5'te p harfi kullanılmış mıdır?

        if (str5.indexOf("=")==-1) {
            System.out.println("str5'te istenen karakter kullanılmamıştır.");
        } else {
            System.out.println("str5'te istenen karakter kullanılmıştır.");
        }



    }
}
