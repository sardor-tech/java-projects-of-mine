import java.util.Scanner;
public class NewJavaM1Lesson5Hw4 {
    static void noname(int a){
        int count = 1;
        if(a >= 100000000){
            count += 8;
            a /= 100000000;
        } else if(a >= 10000){
            count += 4;
            a /= 10000;
        } else if(a >= 100){
            count += 2;
            a /= 100;
        }else if(a >= 10){
            count += 1;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ixtiyoriy son yozin biz sizga nechchi xonaligini ko'rsatamiz: ");
        int number = scanner.nextInt();
        noname(number);


    }
}
