package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba {

    @Override
    public void motor() {
        System.out.println("Toyota arabalar çevreci motor kullanır");
    }
    /*
    Parent classtaki abstract methodların tamamı child class tarafından
    override edilmelidir. Concrete methodların override edilme mecburiyeti yoktur.

    Aslında Toyota classı da obje üreteceğimiz bir class değil.
    Bu durumda eğer proje tasarımı yapıyorsanız Toyota classını da
    abstract yapmanız güzel olur.
     */
}