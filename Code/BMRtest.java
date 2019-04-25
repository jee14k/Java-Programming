import java.util.*;
abstract class Person
{
	Scanner sc = new Scanner(System.in);
	double height;
	double weight;
	String sex;
	double bm;
	public void accept()
	{
		System.out.println("Enter the height: ");
		height = sc.nextDouble();
		System.out.println("Enter the weight: ");
		weight = sc.nextDouble();
		System.out.println("Enter the sex: ");
		sex = sc.next();
	}
	abstract void bmi();	
}
class BMI extends Person
{
	String name;
	double bm;
	BMI(String n)
	{
		this.name=n;	
	}
	public void accept()
	{
		super.accept();
	}
	public void bmi()
	{
		bm = weight/(height * height);
	}
	public void display()
	{
		System.out.println("The Body Mass index of "+name+" is: "+bm);		
	}
}
class BMR extends BMI
{
	int age;
	double bmr;
	BMR(String f)
	{
		super(f);
	}
	public void accept()
	{
		super.accept();
		System.out.println("Enter the age: ");
		age = sc.nextInt();
	}
	public void calc_bmr()
	{
		if(sex=="M"||sex=="Male"||sex=="m"||sex=="male")
		{
			bmr = (13.397*weight)+(4.799*height)-(5.677*age)+88.362;
		}
		else
		{
			bmr = (9.247*weight)+(3.098*height)-(4.330*age)+447.593;	
		}
	}
	public void display()
	{
		super.display();
		System.out.println("The basal metabolic rate of "+name+" is: "+bmr);
	}
}
public class BMRtest
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String name;
		char ch;
		do
		{
			System.out.println("--------------------------------------------------------------");
			System.out.println("Program to find BODY MASS INDEX & BASAL METABOLIC RATE value of a person");
			System.out.println("--------------------------------------------------------------");
			System.out.println("Enter your name: ");
			name = sc.nextLine();
			BMR b = new BMR(name);
			b.accept();
			b.bmi();
			b.calc_bmr();
			b.display();
			System.out.println("Do you wish to continue?(Y/N): ");
			ch = (char)System.in.read();
		}while(ch=='Y'||ch=='y');	
	}
}