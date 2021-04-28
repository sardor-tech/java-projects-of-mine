public class NewJavaM2Lesson1Hw1P1 {
    int x;
    int y;
    static void Point(int x, int y){
        System.out.println("("+x+","+y+")");
    }

    public static void main(String[] args) {
        NewJavaM2Lesson1Hw1P1 a = new NewJavaM2Lesson1Hw1P1();
        a.x = 7;
        a.y = 5;
        Point(a.x,a.y);
    }

}
