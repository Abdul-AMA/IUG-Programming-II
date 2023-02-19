package Labs.Lab02;

public class MyDate {


    private int year;
    private int month;
    private int day;


    public static final String MONTHS[] = new String[]{"Jan", "Feb", "Mar", "Apr"
            , "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String DAYS[] = new String[]{"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};

    public static final int DAYS_IN_MONTHS[] = new int[]{31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31};

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else
            return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if ((year >= 1 && year <= 9999) && (month >= 1 && month <= 12)) {
            if (day >= 1 && day <= DAYS_IN_MONTHS[month - 1]) {
                return true;
            } else if (isLeapYear(year) && month == 2) {
                if (day >= 1 && day <= DAYS_IN_MONTHS[month - 1] + 1) {
                    return true;
                } else
                    return false;
            } else
                return false;
        } else
            return false;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            setYear(year);
            setMonth(month);
            setDay(day);
        } else {
            System.out.println("not vaild boyyyyyy");
        }
    }

    public String toString() {
        return " " + getDay() + " " + MONTHS[getMonth()-1] + " " + getYear();
    }

    public MyDate nextDay() {
        int newDay = 0;
        int newMonth = 0;
        int newYear = 0;
        if (getDay() == getMaxDay(getMonth())) {
            newDay = 1;
            if (getMonth() == 12) {
                newMonth = 1;
                newYear = getYear() + 1;
            } else {
                newMonth = getMonth() + 1;
                newYear = getYear();
            }
        } else if (isLeapYear(getYear()) && getMonth() == 2 && getDay() == 29) {
            newDay = 1;
            newMonth = getMonth() + 1;
            newYear = getYear();
        }else{
            newDay = getDay()+1;
            newMonth = getMonth();
            newYear = getYear();
        }
        this.setDate(newYear, newMonth, newDay);
        return this;
    }

    public MyDate nextMonth() {
        int newDay = 0;
        int newMonth = 0;
        int newYear = 0;

        if (getMonth() == 12) {
            newDay = getDay();
            newMonth = 1;
            newYear = getYear() + 1;
        } else {
            if (getDay() == getMaxDay(getMonth())) {
                newMonth = getMonth() + 1;
                newYear = getYear();
                newDay = getMaxDay(newMonth);
            } else {
                newDay = getDay();
                newYear = getYear();
                newMonth = getMonth() + 1;
            }
        }
        this.setDate(newYear, newMonth, newDay);
        return this;
    }

    public MyDate nextYear() {
        int newDay = 0;
        int newMonth = getMonth();
        int newYear = getYear() + 1;

        if (isLeapYear(newYear) && getDay() == 28) {
            newDay = 29;
        } else if (isLeapYear(newYear - 1) && getDay() == 29) {
            newDay = 28;
        } else {
            newDay = getDay();

        }
        this.setDate(newYear, newMonth, newDay);
        return this;
    }

    public MyDate previousDay() {
        int newDay = 0;
        int newMonth = getMonth();
        int newYear = getYear() + 1;

        if (getDay() == 1) {
            newDay = getMaxDay(getMonth());
            if (getMonth() == 1) {
                newMonth = 12;
                newYear = getYear() - 1;
            } else {
                newMonth = getMonth() - 1;
                newYear = getYear();
            }
        } else if (isLeapYear(getYear()) && getMonth() == 3 && getDay() == 1) {
            newDay = 29;
            newMonth = getMonth() - 1;
            newYear = getYear();
        }else {
            newDay = getDay()-1;
            newMonth = getMonth();
            newYear = getYear();
        }


        this.setDate(newYear, newMonth, newDay);
        return this;
    }

    public MyDate previousMonth() {
        int newDay = 0;
        int newMonth = 0;
        int newYear = 0;


        if (getMonth() == 1) {
            newDay = getDay();
            newMonth = 12;
            newYear = getYear() - 1;
        } else {
            if (getDay() == getMaxDay(getMonth())) {
                newMonth = getMonth() - 1;
                newYear = getYear();
                newDay = getMaxDay(newMonth);
            } else {
                newDay = getDay();
                newYear = getYear();
                newMonth = getMonth() - 1;
            }
        }


        this.setDate(newYear, newMonth, newDay);
        return this;
    }

    public MyDate previousYear() {


        int newDay = 0;
        int newMonth = getMonth();
        int newYear = getYear() - 1;

        if (isLeapYear(newYear) && getDay() == 28) {
            newDay = 29;
        } else if (isLeapYear(newYear + 1) && getDay() == 29) {
            newDay = 28;
        } else {
            newDay = getDay();

        }


        this.setDate(newYear, newMonth, newDay);
        return this;
    }

    public int getMaxDay(int month) {
        if (isLeapYear(getYear()) && month == 2) {
            return 29;
        } else
            return DAYS_IN_MONTHS[month - 1];
    }



}