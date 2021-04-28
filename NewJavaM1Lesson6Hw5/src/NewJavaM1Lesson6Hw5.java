import java.util.Scanner;

public class NewJavaM1Lesson6Hw5 {
    static void ab (String a, String b){
        String firstPart =a.substring(1);
        String secondPart =b.substring(1);
        String add = firstPart.concat(secondPart);
        System.out.println(add);

    }
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.println("text yozing: ");
        String a = scannerA.nextLine();

        Scanner scannerB = new Scanner(System.in);
        System.out.println("text yozing: ");
        String b = scannerB.nextLine();
        ab(a,b);
    }
}
