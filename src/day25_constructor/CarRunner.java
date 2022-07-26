package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.fiyat = 150000;
        car1.yil = 2020;
        car1.marka = "Toyota";

        System.out.println("Car1 bilgileri\nMarka : " + car1.marka + "\nModel : " + car1.model
                           + "\nYıl : " + car1.yil + "\nFiyat : " + car1.fiyat);

        Car car2 = new Car();

        System.out.println("Car1 bilgileri\nMarka : " + car2.marka + "\nModel : " + car2.model
                + "\nYıl : " + car2.yil + "\nFiyat : " + car2.fiyat);

        /*
        Herhangi bir obje üzerinden bir variable yazdırmaya çalıştığımızda
        Java değeri şu sıralama ile arar:
        1- O obje oluşturulduktan sonra bir değer atandı mı diye bakar.
        2- Objenin oluşturulduğu classta variable'a bir değer atanmış mı diye bakar.
        3- O zaman data türüne göre Java default değeri atar.
         */
    }
}