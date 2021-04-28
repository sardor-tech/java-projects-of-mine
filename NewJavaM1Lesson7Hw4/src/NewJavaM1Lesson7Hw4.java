import java.util.Scanner;
public class NewJavaM1Lesson7Hw4 {
    static void Strange (int N){
        while (N <500){
            int son =2;
            N *=son;
            System.out.println(N);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sonlarni ekranga 1 2 4 8 16 32 64 128 256 512 tartibda chiqazuvchi dastur tuzing");
        System.out.println("Son kiriting: ");
        int number = scanner.nextInt();
        Strange(number);
    }
}
