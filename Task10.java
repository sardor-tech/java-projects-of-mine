import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){


        System.out.println(change("saxiy"));
        System.out.println(change("baxil"));
        System.out.println(change("askiya"));
        System.out.println(change("obdon"));
        System.out.println(change("about"));
    }
    public static String change(String str){



        String result = "";

        System.out.println(result);







            String str1 = str.substring(0,1);
            String str2 = str.substring(1,2);
            String str3 = str.substring(2,str.length());

            if (str1.equals("a")){
                result = result.concat(str1);
            }
            if (str2.equals("b")){
                result = result.concat(str2);
            }
            result = result.concat(str3);
            return result;
        }
            {



    }






















}
