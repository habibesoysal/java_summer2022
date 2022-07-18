package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini isteyin
        // girilen ismi
        // isminiz:... şeklinde yazdırın

        // 1) Scanner objesi oluşturalım

        Scanner scan = new Scanner(System.in);

        // 2) Kullanıcıya ne istediğimizi söyleyelim

        System.out.println("Lütfen isminizi girin");

        // 3) Oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp
        // oluşturacağımız uygun bir variable'a atayalım

        String kullaniciIsmi= scan.next();

        System.out.println("İsminiz: " + kullaniciIsmi);



    }
}
