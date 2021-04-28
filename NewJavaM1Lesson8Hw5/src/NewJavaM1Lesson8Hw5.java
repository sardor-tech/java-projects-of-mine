public class NewJavaM1Lesson8Hw5 {
    public static void main(String[] args) {
        int[] numbers={10,20,8,848};
        boolean notfound = true;
        int sum = 0;
        for(int number : numbers){
            if(number % 2 ==1){
                notfound = false;
                break;
            }
            sum += number;
        }
        if(notfound){
        sum = numbers[0] + numbers[numbers.length-1];
        System.out.println(sum);
        }
    }
}
