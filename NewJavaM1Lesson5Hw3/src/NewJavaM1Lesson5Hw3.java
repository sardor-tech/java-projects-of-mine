import java.util.Scanner;

public class NewJavaM1Lesson5Hw3 {
    static void Sq(int neve){


        System.out.println(Math.sqrt(neve)+" gipotenuzasi ");
        System.out.println("bazi birlarini butun qilib chiqarolmadim, agar qolingizdan kelsa to'g'irlab yuborib menga qaytib tashlab yuboring.");

    }
    static void add (int a , int b){
       int x = a + b;

        Sq(x);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("a=");
        int a = scanner.nextInt();
        a *=a;

        Scanner unique=new Scanner(System.in);
        System.out.println("a=");
        int b = unique.nextInt();
        b *=b;
        add(a,b);



    }


}
