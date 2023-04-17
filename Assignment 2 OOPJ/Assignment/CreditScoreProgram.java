import java.util.Scanner;

class CreditScoreProgram
{
	private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;
    
	public CreditScoreProgram() 
    {
		
	}
	
	
	public CreditScoreProgram(int creditHistory, double creditUtilization, boolean paymentHistory) 
    {
		this.creditHistory = creditHistory;
		this.creditUtilization = creditUtilization;
		this.paymentHistory = paymentHistory;
	}


	public int getCreditHistory() 
    {
		return creditHistory;
	}


	public void setCreditHistory(int creditHistory) 
    {
		this.creditHistory = creditHistory;
	}


	public double getCreditUtilization() 
    {
		return creditUtilization;
	}


	public void setCreditUtilization(double creditUtilization) 
    {
		this.creditUtilization = creditUtilization;
	}


	public boolean isPaymentHistory() 
    {
		return paymentHistory;
	}


	public void setPaymentHistory(boolean paymentHistory) 
    {
		this.paymentHistory = paymentHistory;
	}

    public int calculateCreditScore()
    {
        if(this.paymentHistory)
        
             return ((creditHistory*15)+((int)(creditUtilization*30))+55);
        
        else 
        
             return ((creditHistory*15)+((int)(creditUtilization*30))+35);
        
    }

	public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter credit history");
        int creditHistory=sc.nextInt();
        System.out.println("Enter credit utilization");
        double creditUtilization=sc.nextDouble();
        System.out.println("Enter payment history :");
        System.out.println("1.GOOD");
		System.out.println("2.BAD");
		System.out.print("Enter choice	:	");
		int choice =sc.nextInt();
        boolean flag;
        if(choice==1)
        {
            flag=true;
        }
        else 
        {
            flag=false;
        }
        
        CreditScoreProgram csc= new CreditScoreProgram(creditHistory,creditUtilization,flag);
        int creditScore =csc.calculateCreditScore();
        System.out.println("Credit Score is "+creditScore);
	}
}