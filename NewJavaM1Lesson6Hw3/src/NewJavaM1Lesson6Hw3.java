import java.util.Scanner;

public class NewJavaM1Lesson6Hw3 {
    static void two( String a){
        String first;
        if (a.length()>2){
            first = a.substring(0,2);
            System.out.println(first);
        }else{
            first = a;
            System.out.println(first);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter just one word: ");
        String didect = scanner.next();
        two(didect);
    }
}