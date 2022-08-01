package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5, "Ali", "Ayşe", "İsmail", "Ahmet", "Babayiğit", "Akın");

        /*
        Varargs teroik olarak sonsuz sayıda element alabilir.
        Bir methodda parametre olarak varargs varsa
        varargsın sınırlarını bilebilmesi için
        parametrelerin sonuncusu olmalıdır.
        Öncesinde farklı parametreler olabilir ama
        varargstan sonra parametre olamaz.
        Bu kuraldan ötürü bir methodda sadece 1 tane varargs olabilir.
         */
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0];
        for (String each : kelime) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : " + enUzunKelime);
    }
}