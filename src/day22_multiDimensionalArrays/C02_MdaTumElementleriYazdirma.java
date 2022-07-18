package day22_multiDimensionalArrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        // Verilen bir multi-dimensional arrayin
        // tüm elementlerini yazdıran bir mehtod hazırlayalım.

        int[][] sayilar = {{1, 5, 6, 9, 4}, {2, 5, 5, 8}, {3, 1, 6}};

        elementleriYazdir(sayilar);
    }

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length; i++) { // i = 0,1,2 değerleri alacak
            for (int j = 0; j < sayilar[i].length; j++) { // inner arraylerin uzunluğuna bağladık
                System.out.print(sayilar[i][j] + " ");
            }
        }
    }
}