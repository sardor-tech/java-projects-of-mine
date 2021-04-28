import java.util.Scanner;

public class NewJavaM1Lesson5Hw2 {


    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Yil kiriting men sizga qaysi asrga to'g'ri kelishini aniqlab beraman  = ");
        int asr = year.nextInt();
        int palon=asr/(100+1);




        System.out.println("Siz kiritgan "+asr+"-yil "+palon+"-asrga tegishli" );
    }
}
