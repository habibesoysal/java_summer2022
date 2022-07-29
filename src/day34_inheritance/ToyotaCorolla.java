package day34_inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
       /*
       child classtan paretn classa erişimde
       access modifier kurallarını bypass edemeyiz.
       Örneğin parent classtaki private class üyelerini child clasttan kullanamayız.
       Aynı çekilde parent ve child farklı packagelarda ise
       parent classdaki default access modifier'ı olan
       class üyelerini child classtan kullanamayız.
        */

        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model belirtilmedi
    }
}