package day14_mehtodCreation;

public class C04_MethodCreationReturn {
    // Verilen isim ve soyismi ilk harfi büyük
    // geriye kalanları * olacak şekilde değiştirip
    // bize bu halini döndüren bir method oluşturalım
    // NOT: programın ilerleyen kısımlarında isim ve soyismi bu şekilde kullanmak istiyoruz.


    public static void main(String[] args) {

        String isim = "Enes";
        String soyIsim = "Bozkurt";

        String gizliIsim = isimGizle(isim , soyIsim);
        System.out.println(isim + " " + soyIsim);
        System.out.println(gizliIsim);
    }

    private static String isimGizle(String isim, String soyIsim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");

        return isim + " " + soyIsim;
    }
}
