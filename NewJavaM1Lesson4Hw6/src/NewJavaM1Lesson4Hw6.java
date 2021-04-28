import java.util.Scanner;

public class NewJavaM1Lesson4Hw6 {
    public static void main(String[] args) {
        Scanner seasons = new Scanner(System.in);
        System.out.println("1-12 gacha bolgan ma'lum bir oyning nomerini kiriting: ");
        int fasl = seasons.nextInt();

        switch (fasl){
            case 1:
                System.out.println("Yanvar qish fasliga to'g'ri keladi");
                break;

            case 2:
                System.out.println("Fevral qish fasliga to'g'ri keladi ");
                break;
            case 3:
                System.out.println("Mart Bahor fasliga to'g'ri keladi ");
                break;

            case 4:
                System.out.println("Aprel Bahor fasliga to'g'ri keladi ");
                break;
            case 5:
                System.out.println("May Bahor fasliga to'g'ri keladi ");
                break;

            case 6:
                System.out.println("Iyun Yoz fasliga to'g'ri keladi ");
                break;

            case 7:
                System.out.println("Iyul Yoz fasliga to'g'ri keladi ");
                break;

            case 8:
                System.out.println("Avgust Yoz fasliga to'g'ri keladi ");
                break;

            case 9:
                System.out.println("Sentabr Kuz fasliga to'g'ri keladi ");
                break;

            case 10:
                System.out.println("Oktabr Kuz fasliga to'g'ri keladi ");
                break;

            case 11:
                System.out.println("November Kuz fasliga to'g'ri keladi ");
                break;

            case 12:
                System.out.println("Dekabr Qish fasliga to'g'ri keladi ");
                break;
        }
    }
}
