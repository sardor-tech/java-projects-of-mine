import java.util.Scanner;
public class NewJavaM1Lesson9Hw2 {
    static void Fl(float a, float b) {
        System.out.println(a-b);

    }
    public static void main(String[] args) {
        System.out.println(" float va long toifasidagi o’zgaruvchilarni qabul qilib ikkalasini ayirmasini qaytaradigan method yarating. Bunda faqat  float va long toifalaridan foydalaning.  ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Float: ");
        float fl = scanner.nextFloat();
        Scanner dou = new Scanner(System.in);
        System.out.println("Enter Long: ");
        long lo = dou.nextLong();
        float f = lo;
        Fl(fl, f);
    }
}
