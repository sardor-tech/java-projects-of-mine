import java.util.Scanner;
public class NewJavaM1Lesson7Hw3 {
    static void Find(int number){
        for (int i = 1; i < 100/number +1 ; i++) {
            int result = number*i;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sonlarni ekranga 7 14 21 28 35 42 49 56 63 70 77 84 91 98 tartibda chiqazuvchi dastur tuzing");
        System.out.println("son kiriting: ");
        int numb = scanner.nextInt();
        Find(numb);
    }
}
