package day40_finally;

 public class A {
    protected String isim = "Cüneyt";
    final static String OKUL = "Yıldız Koleji";
    /*
    Bir variable final olarak tanımlandıysa başka classlardan veya içinde olduğumuz classtan
    bu variable'a başka değer atanması mümkün değildir.
    Mademki değeri değiştirilemiyor genelde static de yaparak bu variable'a erişim kolaylaştırılabilir.
    Ve genelde static final olarak belirlenen variable isimleri büyük harfle yazılır.
     */

    final void finalMethod(){
        System.out.println("Final methodlar override edilemez.");
        /*
        Bir methodu final olarak işaretlerseniz
        bu method değiştirilemez demektir.
        (Override edilemez.)
         */
    }
}