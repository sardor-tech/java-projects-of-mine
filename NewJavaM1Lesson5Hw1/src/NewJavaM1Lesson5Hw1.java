import java.util.Scanner;

public class NewJavaM1Lesson5Hw1 {

    static void Sew(int feel){
        if (feel > 0){
            System.out.println("siz kiritgan son +");
        }else { System.out.println("siz kiritgan son -");

        }

    }
    public static void main(String[] args) {
        Scanner didect = new Scanner(System.in);
        System.out.println("ishorasini aniqlash uchun son kiriting: ");
        int feel = didect.nextInt();
        Sew(feel);


    }
}
