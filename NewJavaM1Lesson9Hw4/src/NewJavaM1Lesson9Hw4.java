import java.security.AllPermission;
import java.util.Scanner;

public class NewJavaM1Lesson9Hw4 {
    public static double All(double b,double c,double s, double i, double ef){
        double abdulla =  b * c * s * i * ef;
        return abdulla;
    }
    public static void main(String[] args) {
        System.out.println("byte, char, short, int, float toifasidagi qiymatlarni qabul qilib ularning ko’paytmasini qaytaradigan method yarating.");
        Scanner a1 = new Scanner(System.in);
        System.out.println("byte: ");
        byte b = a1.nextByte();
        System.out.println("char: ");
        char c =a1.next().charAt(0);
        System.out.println("short: ");
        short s = a1.nextShort();
        System.out.println("int: ");
        // 5-int
        int i= a1.nextInt();
        System.out.println("float: ");
        float f = a1.nextFloat();
        // intga o'girilgani
        double ib = b;
        double ic = c;
        double is = s;
        double ef = (double) f;
        double di = i;


        System.out.println(All(ib,ic,is,ef,i));


    }
}