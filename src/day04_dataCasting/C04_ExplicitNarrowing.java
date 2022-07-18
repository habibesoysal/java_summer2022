package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1 = 50;
        short sayi2 = (short) sayi1; // normalde sığar ama çalıştırmadan değeri okuyamadığı için hata veriyor.

        /*
        Geniş data türündeki değeri dar data türündeki variable'a atamak istersek
        Java geniş data türündeki değerin, dar data türünün sınırlarına uyup uymayacağını çalıştırana kadar bilemez.
        Ama Java risk almaz. Riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul etmemizi bekler.
        Bunun için değerin önüne parantez içinde istediğimiz data türünü yazmamız yeterlidir.
         */



    }
}
