public class NewJavaM1Lesson7Hw10 {
    public static void main(String[] args) {

        int tubfind=100;
        boolean tubmi;
        for (int i = 2; i <=tubfind ; i++) {

            tubmi=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    tubmi=false;
                    break;
                }
            }
            if (tubmi){
                System.out.println(i);
            }

        }


    }
}
