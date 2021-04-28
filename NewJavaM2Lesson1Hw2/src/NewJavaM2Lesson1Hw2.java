import java.util.Scanner;
public class NewJavaM2Lesson1Hw2 {
    int boyi;
    int eni;
    public static int Yuzasi( int a, int b){
        return  a * b ;
    }
    public static int Para( int a, int b){
        return 2 * (a + b);
    }
    public static void main(String[] args) {
        NewJavaM2Lesson1Hw2 b = new NewJavaM2Lesson1Hw2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("To’g’ri burchakli uchburchak klassini yarating. Uning barcha atributlari va methodlariga mos nom va toifa tanlang. (Eni va bo’yi attributlari, Perimetrini va Yuzasini hisoblaydigan 2 ta methodi bo’lsin).");
        System.out.println("Bo'yini kiriting: ");
        b.boyi = scanner.nextInt();
        System.out.println("Enini kiriting: ");
        b.eni=scanner.nextInt();
        System.out.println(Yuzasi(b.boyi, b.eni )+ " Yazasi");
        System.out.println(Para(b.boyi, b.eni )+ " Para");







    }
}
