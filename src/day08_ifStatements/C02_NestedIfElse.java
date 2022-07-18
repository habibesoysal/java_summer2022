package day08_ifStatements;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        /*
        Emeklilik kontrolü yapan bir program yazalım
        cinsiyet olarak E (erkek) K (kadın) kabul etsin
        farklı bir sembol girilirse hata mesajı versin
        emeklilik için kadınlarda yaş sınırı 60, erkeklerde 65 olsun
        negatif yaş veya 80den büyük yaş girilirse hata mesajı versin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyet giriniz. Kadın için \"K\" erkek için \"E\" giriniz.");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        if (cinsiyet=='E'){
            if (yas<0 || yas>80){
                System.out.println("gecerli yas giriniz");
            }else if(yas<65){
                System.out.println("emekli olamazsin");
            }else {
                System.out.println("emekli olabilirsin");
            }
        } else if (cinsiyet=='K'){
            if (yas<0 || yas>80){
                System.out.println("gecerli yas giriniz");
            }else if(yas<60){
                System.out.println("emekli olamazsin");
            }else {
                System.out.println("emekli olabilirsin");
            }
        }else {
            System.out.println("Lutfen gecerli bir tercih giriniz");
        }



    }
}

