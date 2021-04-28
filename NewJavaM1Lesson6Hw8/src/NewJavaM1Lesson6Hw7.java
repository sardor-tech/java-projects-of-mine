import java.util.Scanner;
public class NewJavaM1Lesson6Hw7 {

    static void compare(String a, String b){
        String nw = "";
        if (a.length()> 0 ){
            nw = a.substring(a.length() - 1);
        }
        String  na="";
        if(b.length()> 0){
            na = b.substring(0, 1);
        }
        String abs = b.substring(1);
        String added = a.concat(abs);
        if (na.equalsIgnoreCase(nw)){
            System.out.println(added+ "  there are no same latter in your word :)");
        }else {
            System.out.println(a.concat(b)+ "  there are two same latter in your word above given :)");
        }
    }
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Type any word: ");
        String a = scannerA.nextLine();

        Scanner scannerB = new Scanner(System.in);
        System.out.println("Type any word: ");
        String b = scannerA.nextLine();
        compare(a ,b );
    }
}
