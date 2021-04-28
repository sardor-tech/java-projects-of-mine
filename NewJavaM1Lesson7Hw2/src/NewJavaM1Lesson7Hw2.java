import java.util.Scanner;

public class NewJavaM1Lesson7Hw2 {
    static void add(int number){

        int b = 0;

        for (int i = 0; i <= number; i++) {
           b = b + i;


            System.out.println(b +" son yig'indisi");




        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Butun sonlar yig'indisini hisoblash: ");
        int any = scanner.nextInt();
        add(any);

    }
}
