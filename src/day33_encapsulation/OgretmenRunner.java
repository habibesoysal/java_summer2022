package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1 = new Ogretmen();
        ogr1.setIsim("Tülay");
        System.out.println(ogr1.getIsim()); // Tülay
        /*
        Bu yöntemde data hiding değil
        daha anlaşılır bir kod amaçlanmış olur.
         */
    }
}
