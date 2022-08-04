package day40_finally;

public abstract class CAbstract {

    void toplama() {
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();

    abstract void bolme();

    void cikarma() {
        System.out.println("Bu method çıkarma yapar");
    }


    /*
    Bir methodun başına abstract yazarsanız
    bu methodun child classlar için bir standart olduğunu deklare etmiş olursunuz.
    Ve method bodysine ihtiyaç kalmaz.
     */
}