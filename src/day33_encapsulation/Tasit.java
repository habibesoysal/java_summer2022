package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    // getter methodu da tek bir satırlık işlem yapıyor
    // başka classların private olduğu için erişemediği
    // tasitTuru bilgisine class içinden alıp
    // istenen farklı classlara return ediyor.

    public void setTasiTuru(String tasiTuru) {
        this.tasitTuru = tasiTuru;
    }
    // return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    // burada bir satırlık islem yapıyor o bir satırlık islemde
    // bizim gönderdiğimiz parametreyi instence variable a atıyor.

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    // boolean variablelar için oluşturulan getter methodlarının ismi
    // isVariableIsmi şeklinde olur.

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}