import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.text.DateFormat;

class DateProgram
{
    int day;
    int  month;
    int year;
    int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
 
    public DateProgram(int day,int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
/*
    boolean is_valid(){
    if (year < 1 || year > 9999) 
    {
        return false;
    }
    if (month < 1 || month > 12) 
    {
        return false;
    }
    if (day < 1 || day > 31)
    {
        return false;
    }
    if (day > getDaysInMonth(year, month)) {
        return false;
    }
    return true;
    } 
    void get_next_day(){
    String nextDate =
      sdf.format(dateSelectedFrom.getTime() + MILLIS_IN_DAY);
    }
    void get_prev_day(){
      //get the previous date in String.
      String previousDate =
      sdf.format(dateSelectedFrom.getTime() - MILLIS_IN_DAY);
    }*/
    void  get_next_day()
    {
    // Getting the next day and formatting into 'YYYY-MM-DD'
		long nextDayMilliSeconds = date.getTime() + ONE_DAY_MILLI_SECONDS;
		Date nextDate = new Date(nextDayMilliSeconds);
		String nextDateStr = sdf.format(nextDate);
    }
    void get_prev_day()
    {
		// Getting the previous day and formatting into 'YYYY-MM-DD'
		long previousDayMilliSeconds = date.getTime() - ONE_DAY_MILLI_SECONDS;
		Date previousDate = new Date(previousDayMilliSeconds);
		String previousDateStr = sdf.format(previousDate);
        
        System.out.println(previousDateStr);
    }
}


class DateUsage
{
    public static void main(String[] args)throws Exception 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter date in format dd/MM/yy");
        String str= sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date date= sdf.parse(str);
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDate());
        DateProgram obj= new DateProgram(date.getMonth()+1,date.getYear()+1900,date.getDate());
        System.out.println("Given Date : " + dateInString);
		System.out.println("Next Date : " + nextDateStr);
		System.out.println("Previous Date : " + previousDateStr);
        
        /*boolean flag=obj.is_valid();
        System.out.println(flag);
        obj.get_next_day();
        //System.out.println(obj.day+" / "+obj.month+" / "+obj.year);
        obj.get_prev_day();
        //System.out.println(obj.day+" / "+obj.month+" / "+obj.year);*/
        //System.out.println(obj.get_next_day());
        //System.out.println(obj.get_prev_day());
    }
}