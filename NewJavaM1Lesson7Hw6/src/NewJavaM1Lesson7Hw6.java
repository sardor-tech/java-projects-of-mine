public class NewJavaM1Lesson7Hw6 {
    public static void main(String[] args) {

            for (int i = 100; i < 500; i++) {
                if (i / 100 + (i / 10) % 10 + i % 10 == 15) {
                    System.out.println(i);
                }
            }

    }

}
