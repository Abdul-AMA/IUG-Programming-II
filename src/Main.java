import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        long elapsedTime = 561555550000l;



        long sec = elapsedTime/1000;
        int day1 = (int) (sec/(60*60*24));
        int day = day1%30;
        int month1 = day1/30;
        int month = month1%12;
        int year1 = month1/12;
        int year= year1 +1970;
        if (month == 0){
            month =1;
        }
        if (day == 0){
            day=1;
        }
        System.out.println("MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}');

    }
}
