public class NewJavaM1Lesson8Hw3 {
    public static void main(String[] args) {
        int []  a = {3,5,7,5,14,21,9,6,15};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] %3==0 && a[i]%7!=0 ){
                b++;
            }
        }
        System.out.println("there "+ b +" numbers that can be divisible only 3 :)");
    }
}
