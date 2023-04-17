import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateProgram
{
    public static void main(String[] args) throws ParseException 
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a date (dd/mm/yyyy): ");
        String date = sc.nextLine();

        
        System.out.print("Enter a time (hh:mm:ss or hh:mm:ss a): ");
        String time = sc.nextLine();

        
        String dateTime = date + " " + time;

        
        DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss ");
        Date dt = dateformat.parse(dateTime);

        
        DateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat d2 = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat d3 = new SimpleDateFormat("yyyy/MM/dd");

        DateFormat t1 = new SimpleDateFormat("hh:mm:ss");
        DateFormat t2 = new SimpleDateFormat("hh:mm:ss a");
        DateFormat t3 = new SimpleDateFormat("hh:mm");

        DateFormat ot1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        DateFormat ot2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        DateFormat ot3 = new SimpleDateFormat("yyyy/MM/dd hh:mm");

        
        System.out.println("Date: " + d1.format(dt) + ", " + d2.format(dt) + ", " + d3.format(dt));
        System.out.println("Time: " + t1.format(dt) + ", " + t2.format(dt) + ", " + t3.format(dt));
        System.out.println("Date and Time: " + ot1.format(dt) + ", " + ot2.format(dt) + ", " + ot3.format(dt));

    }
}

