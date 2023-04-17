import java.util.Scanner;

class BMI 
{	
	private double height;
	private double weight;
	
	public BMI() 
    {
		
	}
	
	public BMI(double height, double weight) 
    {
		this.height = height;
		this.weight = weight;
	}

	public double getHeight() 
    {
		return height;
	}

	public void setHeight(double height) 
    {
		this.height = height;
	}

	public double getWeight() 
    {
		return weight;
	}

	public void setWeight(double weight) 
    {
		this.weight = weight;
	}


    Scanner sc = new Scanner(System.in);
	
	public void acceptBMI()
	{
		System.out.println("Enter height and weight");
		setHeight(sc.nextDouble()); 
		setWeight(sc.nextDouble());
	}
    public void displayBMI()
    {
		    
		System.out.println("height :"+getHeight()+" "+"weight :"+getWeight());
	
    }
	public double calulateBMI()
	{
		double BMI = weight / (height * height);
		return BMI;
	}
}
class BMIProgram
{
	public static void main(String[] args) 
    {
		BMI b = new BMI();
		b.acceptBMI();
        b.displayBMI();
		double calulateBMI = b.calulateBMI();
		System.out.println("BMI : "+calulateBMI);
	}

}
