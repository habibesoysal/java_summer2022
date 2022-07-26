package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        // Bir gün önceki Car classından obje oluşturalım.

        /*
        Farklı bir package'daki bir classtan obje oluşturduğumuzda
        access modifierları da dikkate almalıyız.
         */
        Car car1 = new Car();
        System.out.println(car1.fiyat);

        /*
        Araba classından bir obje oluşturduğumuzda
        eğer default constructor kullanıldıysa
        tüm özellikler için tek tek değer atamak zorunda kalırız.
         */

        Araba araba1 = new Araba();
        araba1.fiyat = 100000;
        araba1.marka = "Mercedes";
        araba1.yil = 2010;
        araba1.model = "C180";

        System.out.println("Araba1 bilgileri\nMarka : " + araba1.marka + "\nModel : " + araba1.model
                + "\nYıl : " + araba1.yil + "\nFiyat : " + araba1.fiyat);

        /*
        Eğer bir objeyi oluştururken bazı özelliklerini
        argument olarak belirtip
        o özelliklerde bir obje oluşturmak istersek
        Java itiraz eder.
        Çünkü her classta default constructor vardır
        ama o da parametresizdir.
        Bizim yeni ve parametreli constructorlara ihtiyacımız var.
         */

        Araba araba2 = new Araba("BMW", "5.20", 2011, 15000);

        System.out.println("Araba2 bilgileri\nMarka : " + araba2.marka + "\nModel : " + araba2.model
                + "\nYıl : " + araba2.yil + "\nFiyat : " + araba2.fiyat);


        Araba araba3 = new Araba("Opel" , "Astra", 2015, 78000);

        System.out.println("Araba3 bilgileri\nMarka : " + araba3.marka + "\nModel : " + araba3.model
                + "\nYıl : " + araba3.yil + "\nFiyat : " + araba3.fiyat);


        Araba araba4 = new Araba("Audi" , "A5", 2020, 50000);

        System.out.println("Araba4 bilgileri\nMarka : " + araba4.marka + "\nModel : " + araba4.model
                + "\nYıl : " + araba4.yil + "\nFiyat : " + araba4.fiyat);

    }
}
