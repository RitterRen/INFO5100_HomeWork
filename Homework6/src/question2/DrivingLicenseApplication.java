package question2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your birthday: (yyyy-mm-dd)");
        String birthday = sc.nextLine();
        SimpleDateFormat sft = new SimpleDateFormat("yyyy-mm-dd");
        try{
            Date date = sft.parse(birthday);
            int age = getAge(date);
            System.out.println("age = " + age);
            if (age < 16){
                System.out.println("The age of the applicant is 14 which is too early to apply for a driving license");
                throw new IllegalArgumentException(
                        "The age of the applicant is 14 which is too early to apply for a driving license");
            }
        }catch(Exception e){

        }

    }

    public static int getAge(Date birthday){
        Calendar cal = Calendar.getInstance();
        Calendar bir = Calendar.getInstance();
        bir.setTime(birthday);
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int yearBirth = bir.get(Calendar.YEAR);
        int monthBirth = bir.get(Calendar.MONTH);

        int temp = 0;
        if ( monthBirth >= monthNow ) {
            temp = 1;
        }
        return yearBirth - yearNow + temp;
    }
}
