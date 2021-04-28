import java.util.Scanner;

public class NewJavaM1Lesson8Hw1 {
    static void Find(int toFind){
        int[] num = {1, 2, 3, 4, 5};
        boolean found = false;
        for (int n : num){
            if (n == toFind){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(toFind + " is found.");

        }else{
            System.out.println(toFind + " is not found.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Massiv ichida berilgan son bor yo’qligini aniqlaydigan dastur tuzing.");
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        Find(num);

    }
}
