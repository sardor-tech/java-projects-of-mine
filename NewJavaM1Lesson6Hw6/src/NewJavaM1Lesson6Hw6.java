import java.util.Scanner;

public class NewJavaM1Lesson6Hw6 {
     static void between ( String a){
         if (a.length() > 2 && a.length()%2 ==0){
             String finalA = a.substring(a.length()/2-1);
             String last = finalA.substring(0,2);
             System.out.println(last+ " the two letters in the middle of the words you wrote ;)");

         }else {
             System.out.println(a+"  ! Word you write is not even or bigger than 2 :(");
         }
     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any words: ");
        String any = scanner.nextLine();
        between(any);
     }
}
