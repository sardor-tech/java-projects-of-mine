public class NewJavaM1Lesson8Hw4 {
    public static void main(String[] args) {
        int [] a = {2,4};
        int add = 0;
        int mult =1;
        for (int i = 0; i <a.length; i++) {
            add +=a[i];
            mult *=a[i];
        }
        System.out.println(add +" yigindisi");
        System.out.println(mult +" ko'paytmasi");
    }
}
