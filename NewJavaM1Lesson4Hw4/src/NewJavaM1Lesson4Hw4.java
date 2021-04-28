import java.util.Scanner;

public class NewJavaM1Lesson4Hw4 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("In order to check given year which is called Kabisa, type year here: ");
        int kabisa = year.nextInt();
        if (kabisa%4==1 || kabisa%100==0){
            System.out.println(" no, bro sorry ;(");
        }else {
            System.out.println( kabisa+ " Yeap, it is Kabisa year ;)");
        }

    }
}

