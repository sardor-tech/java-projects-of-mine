import java.util.Scanner;
public class NewJavaM1Lesson6Hw9 {
    static void hibroa(String a){
        String last = a.substring(a.length() - 2);
        String oxiri = last.substring(last.length()-1);
        String boshi = last.substring(0,1);
        String add = oxiri.concat(boshi);
        String ozak = a.substring(0,a.length()-2);
        System.out.println(ozak.concat(add) + "     mentor sizda boshqacha variantini chat qismga tashashingizni so'rayman mentor ");
    }
    public static void main(String[] args) {
       Scanner scannerA = new Scanner(System.in);
        System.out.println("Type any word: ");
        String a = scannerA.nextLine();
        String reverse = "";
        hibroa(a);
    }
}
