package day05_matematikselIslemler;

public class C02_PrePostIncrement {
    public static void main(String[] args) {

        int sayi = 10;

        System.out.println("pre-increment :" + ++sayi); // önce artır, sonra ata



        System.out.println("post-increment: " + sayi++); // önce ata, sonra artır
        // artık 12. satırdan itibaren sayımızın değeri 12 oldu.


        System.out.println("post-incrementten sonra: " + sayi); // 12 yazdırıldı.


    }
}
