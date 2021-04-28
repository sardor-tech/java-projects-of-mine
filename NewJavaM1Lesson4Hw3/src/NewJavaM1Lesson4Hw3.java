import java.util.Scanner;

public class NewJavaM1Lesson4Hw3 {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("1 - soni kiriting: ");
        int a = hello.nextInt();
        System.out.println(a+ "  <= siz kiritgan 1-son");

        Scanner dear = new Scanner(System.in);
        System.out.println("2 - sonni kiriting: ");
        int b = dear.nextInt();
        System.out.println(b +"  <= siz kiritgan 2-son");

        Scanner sed = new Scanner(System.in);
        System.out.println("3 - sonni kiriting: ");
        int d = sed.nextInt();
        System.out.println(d +"  <= siz kiritgan 3-son");

        Scanner friend = new Scanner(System.in);
        System.out.println("4 - sonni kiriting: ");
        int e = friend.nextInt();
        System.out.println(e +"  <= siz kiritgan 4-son");

        Scanner boy = new Scanner(System.in);
        System.out.println("5 - sonni kiriting: ");
        int c = boy.nextInt();
        System.out.println(c +"  <= siz kiritgan 5-son");

        if ( a > b && a > c && a > d && a > e){
            if (b < c && b < d && b < e  ){
                System.out.println(a + " <= ushbu siz yozgan 1-son, eng katta ");
                System.out.println(b + " <= ushbu siz kiritgan 2-son, eng kichik ");
            }else if(c < b && c < d && c < e){
                System.out.println(a + " <= ushbu siz yozgan 1-son, eng katta ");
                System.out.println(c + " <= ushbu siz kiritgan 5-son, eng kichik ");
            }else if(e < b && e < c && e < d){
                System.out.println(a + " <= ushbu siz yozgan 1-son, eng katta ");
                System.out.println(e + " <= ushbu siz kiritgan 4-son, eng kichik ");
            }else if (d < b && d < c && d < e){
                System.out.println(a + " <= ushbu siz yozgan 1-son, eng katta ");
                System.out.println(d + " <= ushbu siz kiritgan 3-son, eng kichik ");
            }


        }else if(b > a && b > c && b > d && b > e){
            if (c < a && c < d && c<e ){
                System.out.println(b + " <= ushbu siz yozgan 2-son, eng katta ");
                System.out.println(c + " <= ushbu siz kiritgan 5-son, eng kichik ");
            }else if(a < d && a < c && a < e){
                System.out.println(b + " <= ushbu siz yozgan 2-son, eng katta ");
                System.out.println(a + " <= ushbu siz kiritgan 1-son, eng kichik ");
            }else if(d < a && d < c && d < e){
                System.out.println(b + " <= ushbu siz yozgan 2-son, eng katta ");
                System.out.println(d + " <= ushbu siz kiritgan 4-son, eng kichik ");
            }else if ( e < c && e <a && e< d){
                System.out.println(b + " <= ushbu siz yozgan 2-son, eng katta ");
                System.out.println(e + " <= ushbu siz kiritgan 4-son, eng kichik ");
            }



        }else if ( c > a && c > b && c> d && c>e){
            if (a < b && a < d && a < e ){
                System.out.println(c + " <= ushbu siz yozgan 5-son, eng katta ");
                System.out.println(a + " <= ushbu siz kiritgan 1-son, eng kichik ");
            }else if(b < a && b < d && b < e){
                System.out.println(c + " <= ushbu siz yozgan 5-son, eng katta ");
                System.out.println(b + " <= ushbu siz kiritgan 2-son, eng kichik ");
            }else if(d < a && d < b && d < e){
                System.out.println(c+ " <= ushbu siz yozgan 5-son, eng katta ");
                System.out.println(d + " <= ushbu siz kiritgan 5-son, eng kichik ");
            }else if(e < a && e <b &&  e < d){
                System.out.println(c+ " <= ushbu siz yozgan 5-son, eng katta ");
                System.out.println(e + " <= ushbu siz kiritgan 4-son, eng kichik ");

            }



        }else if ( d> a && d > b&& d > c && d >e){
            if (a < b && a < c && a < e ){
                System.out.println(d + " <= ushbu siz yozgan 3-son, eng katta ");
                System.out.println(a + " <= ushbu siz kiritgan 1-son, eng kichik ");
            }else if(b < a && b < c && b < e){
                System.out.println(d + " <= ushbu siz yozgan 3-son, eng katta ");
                System.out.println(b + " <= ushbu siz kiritgan 2-son, eng kichik ");
            }else if(e < a && e < b && e < c){
                System.out.println(d + " <= ushbu siz yozgan 3-son, eng katta ");
                System.out.println(e + " <= ushbu siz kiritgan 4-son, eng kichik ");
            }else if (c < a && c <b && c <e ){
                System.out.println(d + " <= ushbu siz yozgan 3-son, eng katta ");
                System.out.println(c + " <= ushbu siz kiritgan 5-son, eng kichik ");
            }




        }else if ( e> a && e > b&& e > c && e >d) {
            if (a < b && a < d && a < c) {
                System.out.println(e + " <= ushbu siz yozgan 4-son, eng katta ");
                System.out.println(a + " <= ushbu siz kiritgan 1-son, eng kichik ");
            }else if(b < a && b < c && b < d){
                System.out.println(e + " <= ushbu siz yozgan 4-son, eng katta ");
                System.out.println(b + " <= ushbu siz kiritgan 2-son, eng kichik ");
            }else if(c < a && c < b && c < d){
                System.out.println(e + " <= ushbu siz yozgan 4-son, eng katta ");
                System.out.println(c + " <= ushbu siz kiritgan 5-son, eng kichik ");
            }else if (d < a&& d < b && d< c){
                System.out.println(e + " <= ushbu siz yozgan 5-son, eng katta ");
                System.out.println(d + " <= ushbu siz kiritgan 3-son, eng kichik ");

            }


        }
    }
}
