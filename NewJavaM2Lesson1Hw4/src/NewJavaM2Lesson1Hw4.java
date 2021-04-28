
import java.util.Date;
import java.text.*;

public class NewJavaM2Lesson1Hw4 {
    String date;
    String month;
    String year;
     public static String time(String day, String month, String year){
        return day+"."+month+"."+year ;
    }
    public static void main(String[] args) {
        NewJavaM2Lesson1Hw4 today = new NewJavaM2Lesson1Hw4();
        Date data = new Date();

        SimpleDateFormat abc = new SimpleDateFormat("dd");
        SimpleDateFormat bca = new SimpleDateFormat("MM");
        SimpleDateFormat cba = new SimpleDateFormat("yyyy");

        today.date =abc.format(data);
        today.month =bca.format(data);
        today.year =cba.format(data);

        System.out.println(time(today.date, today.month, today.year));
    }

}
