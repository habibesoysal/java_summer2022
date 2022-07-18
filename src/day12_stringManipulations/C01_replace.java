package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = " Bu gün ha va çok güz el ";

        System.out.println(str.replace(" ", ""));

        // hava kelimesini Java yapalım.

        System.out.println(str.replace("h", "J").replace(" ", ""));

        // güz el yerine harika yapalım.

        System.out.println(str.replace("güz el", "harika"));

        // Cümleyi replace kullanarak Bugün Java çok güzel yapalım.

        str = str.replace(" Bu gün" , "Bugün ")
                 .replace(" ha va" , "Java")
                 .replace("güz el" , "güzel");

        System.out.println(str);


    }
}
