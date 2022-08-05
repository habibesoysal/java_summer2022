package day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /* abstract classta main method opsiyoneldir.
           Eğer abstract class sadece child classların
           taşımak zorunda olduğu özellikleri belirlemek için oluşturulduysa
           main methoda ihtiyaç olmaz.
           Sadece abstract methodlar olur.
           Ama bir abstract methodda standart belirlemek dışında da
           methodlar çalışabilir. Bu durumda ihtiyaç olursa main method oluşturulabilir.
         */
    }

    protected abstract void yakit();

    protected abstract void kaporta();

    protected abstract void motor();
    /*
    Sadece child classların mecburi taşıyacakları özellikleri belirleyen methodlar
    abstract method olur ve abstract methodların bodysi olmaz.
     */

    public void klima() {
        System.out.println("Bazı arabalarda klima olabilir");
        /*
        abstract olmayan methodlara concrete method denir.
        abstract bir methodu abstract keyword kullanarak belirtmek zorunludur.
        concrete methodlarda bunun deklare edilmesine gerek yoktur.
        Biz sadece abstraction ile ilgili konuştuğumuzda
        abstract olmayan methodlardan bahsetmek için concrete tabirini kullanırız.
         */
    }
}