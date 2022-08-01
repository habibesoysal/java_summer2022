package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        // arb1 objesi üzerinden marka variable'ına
        // ulaşabildim, değiştirebildim (set) ve yazdırabildim (get)
        arb1.marka = "Toyota";
        System.out.println(arb1.marka); // Toyota

        // access modifier kullanarak marka varibale'ına ulaşımı
        // tamamen serbest yapabilir veya tamamen engelleyebilirim.
        // private yaptığımız model variable'ına ise hiç ulaşamayız.
        // Yani access modifier ya hep ya hiç diyor.

        // modeli değiştirelim ama göremeyelim
        // yakıtı da görelim ama değiştiremeyelim.

        // set ve get yetkilerini özel olarak tanımlamak isterseniz
        // 1. adım - Özel yetki tanımlayacağınız variable'ları private yapın.
        //           private bir dataya başka classlardan ulaşmak mümkün olmadığından
        // 2. adım - set yetkisi için setter ve get yetkisi için getter methodları oluşturalım.

        arb1.setModel("Corolla"); // model olarak Supra'yı atadık
        // modeli yazdırma imkanımız yok çünkü getter methodu yok.

        System.out.println(arb1.getYakit()); // Elektrikli bilgisini yazdırabildik.
        // yakıtı değiştiremeyiz çünkü setter methodu yok.
    }
}