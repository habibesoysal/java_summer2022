package day42_abstractClass_interface;

public class K_ChildClassOfInterfaces implements I02_Interfaces, I03_Interfaces {
    /*
    Bir classı bir interface'e child yapmak için implement keyword kullanılır.
    implements dedikten sonra virgül yazarak istediğimiz kadar interface ekleyebiliriz.
     */

    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI); // 20
        System.out.println(I02_Interfaces.SAYI); // 30
        System.out.println(ISIM); // Yıldız Koleji
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}