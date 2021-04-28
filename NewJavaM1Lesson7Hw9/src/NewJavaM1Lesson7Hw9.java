public class NewJavaM1Lesson7Hw9 {
    public static void main(String[] args) {
        System.out.println("30 - 100 oraliqdagi 3 ga karrali va oxirgi raqami 2,4,8 bo’lgan sonlarni ekranga chiqazing");
        for (int i = 30; i < 100; i++) {
            if (i % 3==0 && i%2==0){
                if (i!=96 && i!=66 && i!=36 &&i!=30 &&i!=60 &&i!=90  ){
                    System.out.println(i);
                }
            }
        }
    }
}
