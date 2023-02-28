package Chapters.Chapter10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class P10_14 {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(561555550000l);
        System.out.println(myDate1.toString());

        MyDate myDate2 = new MyDate(34355555133101L);
        System.out.println(myDate2.toString());


    }

}

class MyDate {

    private Calendar gregorianCalendar = new GregorianCalendar();

    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {

        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);


    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}