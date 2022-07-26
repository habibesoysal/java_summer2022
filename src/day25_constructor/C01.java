package day25_constructor;

public class C01 {

    /*
    Java OOP consept kullandığı için
    oluşturulan her bir classın ihtiyaç olduğunda obje üretebilmesine uygun dizayn etmiştir.
    Ama her classtan obje üretilmeyebilir.

    Bunun için Java ihtiyaç halinde kullanılması için
    her classta default bir constructor koymuştur.

    Bu default constractor classtan obje oluşturulduğunda otomatik olarak çalışır.

    Örneğin bu classta constructor görünmemesine rağmen
    C02 classında, içinde olduğumuz C01 classından bir obje üretebildik.

     */
    int sayi;

    public void deneme(){
        System.out.println("C01'den deneme method çalışır");
    }

}
