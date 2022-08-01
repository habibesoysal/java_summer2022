package day33_encapsulation;

public class Araba {

    String marka = "Marka belirtilmedi";  // markanın access modifierı default access modifier
                                         // olduğundan package içerisinde kullanılabilir.
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli"; // Tüm arabalar elektrikli ise bu variable'ın değiştirilmemesi lazım.
    // private yaptığımız model ve yakıt variable'larına erişimi yetkilendirelim.
    // modele değer atanabilsin ama görülemesin (setter)
    // yakıt ise görülebilsin ama yeni değer atanamasın (getter)


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}