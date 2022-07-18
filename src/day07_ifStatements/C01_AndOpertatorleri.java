package day07_ifStatements;

public class C01_AndOpertatorleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a>0 && b<20 && c>=b);

        System.out.println(a<0 && b<20 && c>=b); // && işareti bir tane false gördüğünde diğerlerine bakmaksızın false yazar.


        System.out.println(a<0 & b<20 & c>=b); // Tek & işareti diğerlerine de bakar.
    }
}
