package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90.0

        System.out.println(satisFiyati); // 100.0

        System.out.println(indirimliFiyat(satisFiyati)); // 90.0
        // iki farklı methodda satisFiyatı isminde variable olabilir.
        // Java buna itiraz etmez çünkü scopeları farklıdır.

    }

    public static double indirimliFiyat(double orijinalFiyat) {
        // methodumuz % 10 indirim yapıp
        // yeni fiyatı main methoda döndürsün

        double satisFiyati = orijinalFiyat * 0.9;

        return satisFiyati;
    }
}