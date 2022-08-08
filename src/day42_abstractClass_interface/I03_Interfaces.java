package day42_abstractClass_interface;

public interface I03_Interfaces {

    int SAYI = 20;


   /* int sayi;
   Interfacelerde tüm variablelar public, static ve finaldır.
   Dolayısıyla sonradan değer atama şansımız yoktur.
   Bunun için variable oluşturduğumuzda mutlaka değer atamalıyız.

   Bir interface bir classı parent edinemez.
    */

    void yakit();
    /*
    Interface içindeki her method public ve abstracttır.

    Abstract bir methodun bodysi olması mümkün değildir.
    Java sonradan developerların isteği üzerine kısmi bir update yapmıştır.

    Bir interface'e sonradan abstract method eklerseniz
    o interface'i daha önce implement etmiş tüm classlara gidip
    hepsinde yeni eklenen methodu override etmeniz gerekir.
    Bu da büyük ve eskiden gelen projeler için çok zor bir işlemdir.
    Bunun için Java, Java 8'den itibaren interfacelere sonradan bodysi olan method eklenmesine izin vermiştir.
    Bu methodların bodysi olsa da interface'in yapısı gereği bu methodlara concrete denmez.
    Bodysi olan bu methodlar istisna olarak kabul edilebilir.
     */

    public void motor();

    public abstract void teker();
}