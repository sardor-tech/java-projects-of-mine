import java.util.Scanner;

public class NewJavaM1Lesson6Hw7 {

    static void indexlar (String inputString , int b , int d){
        if (inputString.length() - b > 1 && b > 0) {
            System.out.println(inputString.substring(b, (d + 2))); ;
        } else {
            System.out.println(inputString.substring(0, 2));
        }

    }
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Type any word: ");
        String a = scannerA.nextLine();

        Scanner scannerB = new Scanner(System.in);
        System.out.println("Type any word: ");
        int b =scannerB.nextInt();

        Scanner scannerD = new Scanner(System.in);
        System.out.println("Type any word: ");
        int d =scannerD.nextInt();

        indexlar(a,b,d);




    }


}
