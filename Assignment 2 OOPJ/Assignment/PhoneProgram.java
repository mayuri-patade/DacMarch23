import java.util.Scanner;
class bill
{
    String customerName;
    long phoneNo;
    int noOfCalls;
    double durationOfCalls;

    bill()
    {
    this.customerName=null;
    this.phoneNo=0;
    this.noOfCalls=0;
    this.durationOfCalls=0;
    }

    bill(String customerName,long phoneNo,int noOfCalls,double durnOfCalls)
    {
    this.customerName=customerName;
    this.phoneNo=phoneNo;
    this.noOfCalls=noOfCalls;
    this.durationOfCalls=durationOfCalls;
    }

    public double calculateBill() 
    {
        if (this.noOfCalls <= 100) 
        {
            return(( this.noOfCalls * 50)+1000);
        } 
        else if (this.noOfCalls > 100 ) 
        {
            return((( this.noOfCalls-100)*25+5000)+1000);
        } 
        else 
        {
            System.out.println("Invalid Input");
        }
        return 0;
    }

    void acceptRecord(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your name");
    this.customerName=sc.nextLine();
    System.out.println("Enter phone no");
    this.phoneNo=sc.nextLong();
    System.out.println("Enter Number Of Calls");
    this.noOfCalls=sc.nextInt();
    System.out.println("Enter duration Of Calls in minutes");
    this.durationOfCalls=sc.nextDouble();
    }
}

public class PhoneProgram
{
    public static void main(String[] args) 
    {
        bill b= new bill();
        b.acceptRecord();
        double bill = b.calculateBill();
        System.out.println("The amount of bill for customer "+b.customerName+" is "+bill+" Cents");   
    }   
}
