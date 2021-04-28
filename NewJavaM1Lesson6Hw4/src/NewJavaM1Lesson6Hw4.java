import javax.swing.*;
import java.util.Scanner;

public class NewJavaM1Lesson6Hw4 {
     static  void cut (String fistVsLast){
         if ( fistVsLast.length() > 2){
            String  fina = fistVsLast.substring(1, fistVsLast.length() - 1);
             System.out.println(fina);
         }else {
             System.out.println(fistVsLast + " No, Why  you entered 2 digits word");
         }
     }
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("We will cut first and last digits of the word that you entered: ");
        String fistVsLast = scanner.nextLine();
        cut(fistVsLast);
     }
}
