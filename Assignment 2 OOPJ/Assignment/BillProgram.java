import java.util.Scanner;

class ElectricityBill 
{
    String customerName;
    double unitsConsumed;
    double billAmount;
    
    public ElectricityBill() 
    {
        this.customerName = "Default";
        this.unitsConsumed = 0.0;
        this.billAmount = 0.0;
    }

    public  ElectricityBill(String customerName, double unitsConsumed, double billAmount) 
    {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = billAmount;
    }

    public void calculateBillAmount() 
    {
        if (this.unitsConsumed <= 100) 
        {
            this.billAmount = this.unitsConsumed * 5;
        } 
        else if (this.unitsConsumed >= 101 && this.unitsConsumed <= 200) 
        {
            this.billAmount = this.unitsConsumed * 7;
        } 
        else if (this.unitsConsumed > 200) 
        {
            this.billAmount = this.unitsConsumed * 10 ;
        } 
        else 
        {
            System.out.println("Invalid Input");
        }
    }
}

public class BillProgram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter units consumed: ");
        double units = 0.0;
        units = sc.nextDouble();
        if(units<0)
        {
            System.out.println("Invalid units Input");
        }
        else
        {
        ElectricityBill bill = new ElectricityBill(name, units, 0.0);
        bill.calculateBillAmount();
        System.out.println("The electricity bill for " + bill.customerName + " whose unit is "+bill.unitsConsumed+" and amount is " + bill.billAmount);
        }
    }
}

