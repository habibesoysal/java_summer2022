package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        İçinde 200 tane 1000'den küçük pozitif tam sayı olan bir list oluşturun.
        Kullanıcıdan bir sayı isteyip
        listede var olup olmadığını kullanıcıya bildirin.
         */

        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {
            sayi = rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi = false;
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);

        while (!bildiMi) {
            System.out.print("Lütfen bir sayı tahmininde bulununuz : ");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayı buldunuz!");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + " adet sayı söylediniz ama hiçbiri listede yok.");
                tahminSayisi++;
            }
        }
    }
}