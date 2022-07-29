package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        // Verilen bir input'u tersine çevirip bize döndüren bir method oluşturun

        String input = "Hey gidi for loop günleri";

        String tersInput = tersineCevir(input);
        System.out.println(tersInput); // irelnüg pool rof idig yeH
    }

    public static String tersineCevir(String input) {

        StringBuilder sb =  new StringBuilder(input);
        sb.reverse();
        return sb.toString();

    }
}