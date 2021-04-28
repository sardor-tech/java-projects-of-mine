import java.util.Scanner;

public class NewJavaM1Lesson9Hw1 {
    static double AddIntDouble(double c, double b){
        return c+b ;


    }
    public static void main(String[] args) {
        System.out.println("int va double toifasidagi o’zgaruvchilarni qabul qilib ikkalasini yig’indisini qaytaradigan method yarating. Bunda faqat int va double toifalaridan foydalaning. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int: ");
        int in = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter double: ");
        double dou = scanner2.nextDouble();
        double c = in;

        System.out.println(AddIntDouble(dou,c));
    }
}
