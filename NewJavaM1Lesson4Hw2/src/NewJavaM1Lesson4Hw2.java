import java.util.Scanner;

public class NewJavaM1Lesson4Hw2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("son kiriting: ");

        int a = keyboard.nextInt();

        if (a % 5 == 0 && a % 3 == 0 && a > 0 ){
            System.out.println(a*a+" soni 5 ga va 3 ga bolinadi ");

        }else {
            System.out.println(a*a*a +" 3 ga va 5 ga bo'linmaydigan sonning kubi.");
        }
    }
}
