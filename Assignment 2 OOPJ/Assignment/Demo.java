import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Demo {

	// Millseconds in a day
	private static final long ONE_DAY_MILLI_SECONDS = 24 * 60 * 60 * 1000;

	// date format
	private static final String DATE_FORMAT = "dd/MM/yyyy";

	public static void main(String[] args) throws ParseException {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter date in format dd/MM/yyyy");
        String dateInString= sc.next();
        // Simple date formatter
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		Date date = dateFormat.parse(dateInString);
        int day = date.getDate();
        int month = date.getMonth() + 1;
        int year = date.getYear() + 1900;
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        
		dateFormat.setLenient(false);
        try 
        {
        date = dateFormat.parse(dateInString);
        System.out.println("Valid");
        }
        catch (ParseException e)
        {
        System.out.println("Invalid");
        }
		
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
        else
         System.out.println("Specified year is not a leap year");

		// Getting the next day and formatting into 'YYYY-MM-DD'
		long nextDayMilliSeconds = date.getTime() + ONE_DAY_MILLI_SECONDS;
		Date nextDate = new Date(nextDayMilliSeconds);
		String nextDateStr = dateFormat.format(nextDate);

		// Getting the previous day and formatting into 'YYYY-MM-DD'
		long previousDayMilliSeconds = date.getTime() - ONE_DAY_MILLI_SECONDS;
		Date previousDate = new Date(previousDayMilliSeconds);
		String previousDateStr = dateFormat.format(previousDate);

		// printing the input, tomorrow and yesterday's date as strings. 
		System.out.println("Given Date : " + dateInString);
		System.out.println("Next Date : " + nextDateStr);
		System.out.println("Previous Date : " + previousDateStr);
	}
}