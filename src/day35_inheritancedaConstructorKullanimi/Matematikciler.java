package day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler() {
        System.out.println("Matematikçiler parametresiz cons");
    }

    Matematikciler(String isim) {
        this();
        System.out.println("Matematikçiler parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1 = new Matematikciler("Tuğba");
    }
    /*
    this() cons call içinde bulunulan classtaki consları
    super() ise parent classta bulunan consları çağırır.

    this() veya super () parametre yapısına uygun bir cons bulamazsa
    Java CTE verir.

    cons konusunda gördüğümüz this. o classtaki instance variable'ları
    refere ediyordu.

    inheritance'da super. vardır
    super. parent classtaki instanceları refere eder.
     */
}