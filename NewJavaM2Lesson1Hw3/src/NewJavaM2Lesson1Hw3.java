import java.util.Scanner;
public class NewJavaM2Lesson1Hw3 {
    int firstAtribut;
    int secondAtribut;
    static void aboutAttributes(int e , int f){
        System.out.println("birinchi kiritilgan son "+e+" ikknchi kiritilgan sin "+f);
    }

    static void maxAttribute(int c , int d){
       if (c > d){
           System.out.println("1-kiritilgan son 2-kiritilgan sondan  katta");
       }else {
           System.out.println("1-kiritilgan son 2-kiritilgan sondan kichik");
       }
    }
    public static int sumAttributes(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        NewJavaM2Lesson1Hw3 a = new NewJavaM2Lesson1Hw3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita atribut: firstAtribut va secondAttribut larga ega MyClass nomli klass yarating. Ushbu atributlar qiymatini aboutAttributes, yig’indisini sumAttributes, kattasini maxAttribute ekranga chiqazadigan methodlarini yarating.");
        System.out.println("1- soni kirining: ");
        a.firstAtribut = scanner.nextInt();
        System.out.println("2 - soni kiriting: ");
        a.secondAtribut = scanner.nextInt();
        aboutAttributes(a.firstAtribut,a.secondAtribut);
        maxAttribute(a.firstAtribut, a.secondAtribut);
        System.out.println(sumAttributes(a.firstAtribut, a.secondAtribut)+" Yig'indisi");
    }
}
