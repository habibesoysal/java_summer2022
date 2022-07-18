package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str = "Java öğrenmek çok güzel";
        /*
        Verilen bir String'de herhangi bir String veya char'ın
        ilk kullanuldığı indexi döndürür.
         */

        System.out.println(str.indexOf('ğ')); //6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j")); // -1

        System.out.println(str.indexOf("mek")); // 10

       // Eğer istediğimiz indexten sonrasını kontrol etmek istersek
       // o zaman aynı methodu iki parametreli olarak kullanabiliriz.

        System.out.println(str.indexOf("ğ",6)); // Yazılan indexten başlar.

        // Yukarıdaki str'da ikinci ve üçüncü e harfinin indexlerini bulun
        // İkinci e harfini bulabilmek için birinci e harfinin indexine ihtiyacım var.

        int ilkE = str.indexOf("e");
        int ikinciE = str.indexOf("e" ,ilkE+1);
        System.out.println(ikinciE);

        // Eğer ikinci e varsa üçüncü e'nin olup olmadığını
        // ve varsa indexini yazdıralım.

        if (ikinciE == -1) {
            System.out.println("Verilen str'da ikinci e yoktur.");
        } else {
            int ucuncuE = str.indexOf("e" , ikinciE+1);
            if (ucuncuE == -1) {
                System.out.println("Verilen str'da üçüncü e yoktur.");
            } else System.out.println("Verilen str'daki üçüncü e'nin indexi : " + ucuncuE);
        }



    }
}
