import java.util.Scanner;

public class NewJavaM1Lesson6Hw1 {
     static void abbamethod ( String a, String b){
         System.out.println(a.concat(b)+b.concat(a)+ " <= This is abba method.");
     }
     public static void main(String[] args) {
        Scanner scannerA= new Scanner(System.in);
        System.out.println("Type new word you want: ");
        String a = scannerA.nextLine();
        Scanner scannerB= new Scanner(System.in);
        System.out.println("Type second new word you want: ");
        String b = scannerB.nextLine();
        abbamethod(a,b);
     }
}
