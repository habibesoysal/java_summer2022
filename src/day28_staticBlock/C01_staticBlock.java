package day28_staticBlock;

public class C01_staticBlock {

    static int sayi;

    static {
        /*
        static block class üyelerinin tamamından önce çalışır.
        (main methoddan bile önce)

        static block class oluşturulduğunda çalışır
        genellikle de classla ilgili ön ayarlamalar
        veya static variable'lara değer atamak için kullanılır.

        static blockların class içerisinde nerede olduğu önemli değildir.
        önce static blocklar çalışır.

        birden fazla static block varsa yukarıdan aşağı doğru çalışır.
         */

        System.out.println("static block çalıştı");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main method çalıştı");
        System.out.println(sayi);
    }

    static {
        System.out.println("main method altındaki static block çalıştı");
    }
}
