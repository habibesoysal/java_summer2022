package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr = {"İsmail", "Nurullah", "Fatih"};
        /*
        Uzun listeler oluşturmamız gerektiğinde
        tek tek eklemek yerine array oluşturup
        bunları list'e çevirmek daha pratik olabilir.
        1) Loop ile arraydeki tüm elementleri list'e atabiliriz.
        2) Arrays.asList() kullanabiliriz.
           Ancak bu methodun 2 tane kötü yan etkisi var.
           - Arrays classı kullanıldığı için array özellikleri geçerli olur
             dolayısıyla list'te olan add, remove gibi size'ı değiştiren methodlar
             bu şekilde oluşturulan list'lerde kullanılamaz.
           - Kaynak olan array ile ürün olan list özdeşleştirilir.
             Birinde yapılan değişiklik otomatik olarak diğerine de işlenir.
         */

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList); // [İsmail, Nurullah, Fatih]

        // 1. yan etki
        // sinifList.add("Erdi"); // UnsupportedOperationException
        // sinifList.remove(1); // UnsupportedOperationException

        // 2. yan etki
        arr[1] = "Emre";
        System.out.println("Değişim sonrası array : " + Arrays.toString(arr));
        System.out.println("Arrayi değiştirince list : " + sinifList);

        sinifList.set(0, "Utku");
        System.out.println("List'i değişitirince list : " + sinifList);
        System.out.println("List'i değiştirince array : " + Arrays.toString(arr));

    }
}