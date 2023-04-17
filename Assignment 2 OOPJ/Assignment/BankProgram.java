import java.util.Scanner;
class BankingManagement 
{
	private String accountHolderName;
	private int accountNumber;
	private double balance;
	
	public BankingManagement() {
		this.accountHolderName = "";
		this.accountNumber = 0;
		this.balance = 0.0;
	}
	public BankingManagement(String accountHolderName, int accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	static Scanner sc = new Scanner(System.in);
	public static int menuList( ){
		    System.out.println("0.Exit");
		    System.out.println("1.Create Account.");
		    System.out.println("2.Deposit Money");
		    System.out.println("3.Withdraw Money");
		    System.out.println("4.Display Balance");
		    System.out.println("5.Account Details");
		    System.out.print("Enter choice  : ");
		    return sc.nextInt();
		  }

	public void createAccount() {
		System.out.print("Enter your Name: ");
		sc.nextLine();
		setAccountHolderName(sc.nextLine());
		System.out.println("Enter the Accountno. : ");
		setAccountNumber(sc.nextInt());
		System.out.println("Bank Account created Successfully");
	}

	public void depositMoney() {
		 System.out.println("Enter Account number:");
		 int accountNumber = sc.nextInt();
		 if(accountNumber == getAccountNumber()) {
		 System.out.println("Enter the Amount to be deposited: ");
		 double amount =sc.nextInt();
		 double balance = getBalance();
		 balance = balance + amount;
		 setBalance(balance);
		 System.out.println("Deposited Succesfully");
		 }
		 else {
			 System.out.println("Enter a Valid Account number");
		 }		
	}
	public void withdrawMoney() {
		 System.out.println("Enter Account number");
		 int accountNumber =sc.nextInt();
		 if(accountNumber == getAccountNumber()) {
			 System.out.println("Enter the amount to be Withdrawn");
			 double amount =sc.nextInt();
			 if(amount > getBalance()) {
				 System.out.println("Insufficient Balance");
			 }
			 else {
				 double balance = getBalance();
				 balance = balance - amount;
				 setBalance(balance);
			 }
		 }
	 }
	 public void displayAccountBalance() {
		 System.out.println("Enter the Account number");
		 int accountNumber = sc.nextInt();
		 if(accountNumber == getAccountNumber()) {
			 System.out.println("Your account Balance is: "+getBalance());
		 }
		 else {
			 System.out.println("Entered account number is invalid");
		 }
	 }
	 public void displayAccountDetails() {
		 System.out.println("Enter the Account number");
		 int accountNumber = sc.nextInt();
		 if(accountNumber == getAccountNumber()) {
			 System.out.println("Account Holder Name: "+getAccountHolderName());
			 System.out.println("Account Number: "+getAccountNumber());
			 System.out.println("Account Balance: "+getBalance());
		 }
	 }
}
public class BankProgram
{
	public static void main(String[] args) {
		BankingManagement bm = new BankingManagement();
		
		int ch;
		while((ch=BankingManagement.menuList())!=0) {
			switch (ch) {
			case 1:bm.createAccount();
				break;
			case 2:bm.depositMoney();
				break;
			case 3:bm.withdrawMoney();
				break;
			case 4:bm.displayAccountBalance();
				break;
			case 5:bm.displayAccountDetails();
				break;
			default:System.out.println("Enter a valid choice");
				break;
			
			}
		}	
	}

}

