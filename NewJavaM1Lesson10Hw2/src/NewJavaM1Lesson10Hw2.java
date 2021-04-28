import java.util.Scanner;

public class NewJavaM1Lesson10Hw2 {
    public static String happy(double a){
        return String.valueOf(a);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("double ko'rinishda sonni qabul qilib uni String toifasiga o'girib qaytaruvchi method yarating.");
        System.out.println("Enter Double that can be changed to String: ");
        double d = scanner.nextDouble();
        System.out.println(happy(d));
    }
}
