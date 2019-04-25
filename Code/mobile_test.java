import java.util.Scanner;
class mobile
{
	int m,number,rating;
	double price;
	String brand;
	Scanner sc = new Scanner(System.in);	
	void read()
	{
		System.out.println("Enter the model number: ");
		number = sc.nextInt();
		System.out.println("Enter the rating out of 5");
		rating = sc.nextInt();
		System.out.println("Enter the price in float value: ");
		price = sc.nextDouble();
		System.out.println("Enter the brand: ");
		brand = sc.nextLine();
	}
	void display()
	{
		System.out.println("The model number is: "+number);
		System.out.println("The rating is[0 to 5]: "+rating);
		System.out.println("The brand is: "+brand);
		System.out.println("The price is: "+price);
	}
}
class mobile_test
{
	public static void main(String args[])
	{	
		mobile m = new mobile();
		m.read();
		m.display();
	}
}