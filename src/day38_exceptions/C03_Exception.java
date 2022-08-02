package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {
    public static void main(String[] args) {
        /*
        Marketteki tüm ürünleri bir Arrayde tuttuğumuzu varsayalım.
        Kullanıcıya indeks sorup o indeksteki ürünü yazdıran bir program hazırlayalım.
        Kullanıcı ürün sayısından büyük bir indeks girerse
        exception vermesinin önüne geçelim.
         */

        String[] urunler = {"Nutella", "Çokokrem", "Süt", "Çay", "Fındık"};
        Scanner scan = new Scanner(System.in);
        System.out.print("İstediğinin ürünün sıra numarasını giriniz : ");

        int istenenSira = 0;
        try {
            istenenSira = scan.nextInt() - 1;
        } catch (Exception e) {
            System.out.println("e = " + e);
        }

        /*
        catch bloğunun önünde parantezde
        exception classının ismi ve yanında yakalanan exception'ı atadığımız variable'ın ismi olur (e)

        Eğer yakalanan exception ile ilgili bilgileri kullanıcıya vermek isterseniz bu objeyi kullanabilirsiniz.
        Eğer exception ile ilgili kullanıcıya bilgi verme ihtiyacı yoksa e kullanılmasa da kod çalışır.
         */

        try {
            System.out.println("Aradığınız ürün : " + urunler[istenenSira - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiğiniz sıra listemizde bulunmuyor"+
                    "\nSıra numarası en fazla " + (urunler.length) + " olabilir.");
        }
    }
}