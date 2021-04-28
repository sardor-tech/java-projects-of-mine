public class M1Lesson2Hw3 {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int holder = a;
        a = b;
        b = holder;
        System.out.println( "the value of a=" + a + " successfully changed");
        System.out.println( "the value of b="+ b + " successfully changed");

    }
}
