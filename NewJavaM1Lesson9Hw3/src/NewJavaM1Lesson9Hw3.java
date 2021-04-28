import java.util.Scanner;

public class NewJavaM1Lesson9Hw3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Double toifasidagi qiymat berilgan. Ushbu qiymatning long, int, short, char, byte, float toifasiga o’giring.");
        System.out.println("Enter a number: ");
        double d = scanner.nextDouble();
        long l =(long) d;
        System.out.println(l + " long value");
        int i = (int) d;
        System.out.println(i+" int value");
        short s = (short) l;
        System.out.println(s+" short value");
        byte b = (byte) l;
        System.out.println(b+ " byte value");

    }
}
