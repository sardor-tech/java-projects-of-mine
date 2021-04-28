public class NewJavaM2Lesson1Hw5 {
    String name;
    String surname;
    int groupNo;
    String[] subjectss;
    static void printSubjects(String[] hi){
        for (int i = 0; i < hi.length; i++) {
            System.out.println(hi[i]);
        }
    }
    public static void main(String[] args) {
        NewJavaM2Lesson1Hw5 s =new NewJavaM2Lesson1Hw5();
        s.subjectss = new String[]{"Math", "Biology","mother tongue","English","MM"};
        printSubjects(s.subjectss);
    }
}
