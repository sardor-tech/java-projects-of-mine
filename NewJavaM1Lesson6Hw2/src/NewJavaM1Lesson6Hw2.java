import java.util.Scanner;
public class NewJavaM1Lesson6Hw2 {
    static  void  humoMethod(String a){
        if (a.length() > 2)
        {
           String lastTwoDigits = a.substring(a.length() - 2);
            System.out.println(lastTwoDigits.concat(lastTwoDigits)+lastTwoDigits);
        }
        else
        {
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any word you want: ");
        String a = scanner.nextLine();
        humoMethod(a);

    }
}
