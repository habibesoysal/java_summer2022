package day40_finally;

final public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.isim = "Alp";

        System.out.println(A.OKUL);

        /*
        Bir class final olarak belirlenirse o class inherit edilemez.
         */
    }
}