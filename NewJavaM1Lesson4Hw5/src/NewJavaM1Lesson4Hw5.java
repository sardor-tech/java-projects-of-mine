import java.util.Scanner;

public class NewJavaM1Lesson4Hw5 {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.println("Biron-bir hafta kunini (1-7) gacha kiriting: ");
        int holiday = days.nextInt();

        switch (holiday) {
            case 1:
                System.out.println("Dushanba ish kuni");
                break;
            case 2:
                System.out.println("Seshanba ish kuni");
                break;
            case 3:
                System.out.println("Chorshanba ish kuni");
                break;
            case 4:
                System.out.println("Payshanba ish kuni");
                break;
            case 5:
                System.out.println("Juma ish kuni");
                break;
            case 6:
                System.out.println("Seshanba dam olish kuni" );
                break;
            case 7:
                System.out.println("Yakshanba  dam olish kuni");
                break;
        }
    }
}
