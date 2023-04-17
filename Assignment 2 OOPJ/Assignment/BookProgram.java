import java.util.Scanner;
class Book 
{
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;
	
	public Book() 
    {
		this.title = "Let us C";
		this.author = "Yashavant Kanetkar";
		this.publisher = "BPB";
		this.isbn = "022-555-887-852";
		this.year = 2022;
		this.price = 566;
		this.quantity = 1000;
	}
	
	
	public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
		this.quantity = quantity;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    void increaseQuantity(int quantity){
    this.quantity+=quantity;

    }
    void decreaseQuantity(int quantity){
        this.quantity-=quantity;
    }
    double getInventoryValue(){
        return this.quantity*this.price;
    }
    

}
class BookProgram
{
   
    public static void main(String[] args) {
    Book b = new Book();
    Scanner sc = new Scanner(System.in);
		System.out.println("1.Add BOOK");
		System.out.println("2.Remove BOOK");
		System.out.print("Enter choice	:	");
		int choice =sc.nextInt();
        if(choice==2)
        {
        System.out.print("No of books to remove :");
        int num=sc.nextInt();
        b.decreaseQuantity(num);
        }
        else 
        {
        System.out.print("No of books to add :");
        int num=sc.nextInt();
        b.increaseQuantity(num);
        }
        
        double value=b.getInventoryValue();
        System.out.println("The total no of "+b.getTitle()+" books are + "+b.getQuantity());
        System.out.println("The Total cost of inventory is "+value);
        

	}

}
