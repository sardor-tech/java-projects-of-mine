public class NewJavaM1Lesson7Hw8 {

    public static void main(String[] args) {
        double n = 10;
        int count1 = 1;
        int count2 = 1;
        double sum = 10;

        while (n <= 20) {
            n = n + 0.1 * n;
            count1++;

            if (sum <= 100) {
                sum += n;
                count2++;
            }
        }

        System.out.printf(" %s kunda 20kmdan kam bo'lmagan yo'lni bosadi va %s kunda bosgan yo'li " + "  summasi 100km dan oshadi ", count1 , count2);

    }


}
