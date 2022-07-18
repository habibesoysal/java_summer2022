package day13_methodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {

        /*
        String mehodlarını kullanarak " Java ogrenmek123 Çok guzel@ " cümlesini
        "Java öğrenmek çok güzel." haline getirelim
         */

        String str = " Java ogrenmek123 Çok @guzel ";

        str = str.trim(); // Java ogrenmek123 Cok guzel@
        str = str.replaceAll("\\d" , ""); // Java ogrenmek çok guzel@
        str = str.replace("@" , ""); // Java ogrenmek çok guzel
        str = str.replaceAll("Ç", "ç");
        str = str + "."; // Java ogrenmek çok guzel.


        System.out.println(str);
    }
}
