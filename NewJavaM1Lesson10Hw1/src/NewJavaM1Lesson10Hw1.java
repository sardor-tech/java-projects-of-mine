import java.util.Scanner;

public class NewJavaM1Lesson10Hw1 {
    public static double Duble(String a){
        return Double.parseDouble(a);

    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("String ko'rinishda sonni qabul qilib uni Double toifasiga o'girib qaytaruvchi method yarating.");
        System.out.println("Enter String that can be changed to Double: ");
        String s= scanner.nextLine();
        System.out.println(Duble(s));

    }
}
