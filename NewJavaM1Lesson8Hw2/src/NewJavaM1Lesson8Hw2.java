public class NewJavaM1Lesson8Hw2 {
    public static void main(String[] args) {
        int even = 0;
        int [] evenNumbers = {2,5,4,3,2,5,7,8,9,8};
        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i]%2==0){
                even++;

            }
        }
        System.out.println("Number of even elements in the array:" +even);
    }
}

