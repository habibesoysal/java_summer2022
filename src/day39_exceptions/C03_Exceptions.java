package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str = "123a5";
        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdığınız değer sadece rakamlardan oluşmalıdır.");
        } catch (Exception e) {
            System.out.println("Öngörülemeyen bir hata oluştu");
        }

        System.out.println("Sayının karesi : " + (sayi * sayi));

        /*
        Kullanıcıdan String olarak bir değer alıyor ve bunu
        int'a çeviriyorsak NumberFormatException ile karşılaşabileceğimizi öngörürüz.
        NumberFormatException aldığımızda kodun durmamasını istiyorsak
        try-catch ile çevreleyebiliriz.

        Eğer bilmediğim bir exception daha oluşursa
        kod durmasın istiyorsak bir kere daha catch cümlesi ekleyip
        ona da en geniş exception'ı yazabiliriz.
         */
    }
}