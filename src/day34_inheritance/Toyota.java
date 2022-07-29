package day34_inheritance;

public class Toyota {

    protected String marka = "Toyota";
    protected String model = "Model belirtilmedi";
    protected String yakit = "Yakıt belirtilmedi";

    protected void motor() {
        System.out.println("Toyota çevreci motorlar kullanır");
    }

    protected void aku() {
        System.out.println("Toyota modele göre akü kullanır");
    }
}