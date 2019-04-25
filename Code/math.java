import java.util.*;
class math
{
	void root(double r)
	{
		double res;
		System.out.println("Function to find the Square Root of a number");
		res=Math.sqrt(r);
		System.out.println("The square root of "+r+"is: "+res);
	}
	void ceil(double c)
	{
		double res;
		System.out.println("Function to find the ceiling of a number");
		res=Math.ceil(c);
		System.out.println("The ceiling of "+c+"is: "+res);
	}
	void floor(double f)
	{
		double res;
		System.out.println("Function to find the floor of a number");
		res=Math.floor(f);
		System.out.println("The floor of "+f+"is: "+res);
	}
	void max(int n1,int n2)
	{
		int res;
		System.out.println("Function to find the maximum of 2 numbers");
		res=Math.max(n1,n2);
		System.out.println("The maximum of "+n1+"and "+n2+"is: "+res);
	}
	void log(double g)
	{
		double res,b_ten;
		System.out.println("Function to find the Logarithmic value of a number");
		res=Math.log(g);
		b_ten=Math.log10(g);
		System.out.println("The log value of "+g+" is: "+res);
		System.out.println("The log value of "+g+" to the base 10 is: "+b_ten);
		}
	void exp(double e)
	{
		double res;
		System.out.println("Function to find the exponent of a number");
		res=Math.exp(e);
		System.out.println("The Exponent of "+e+" is"+res);
	}
	void sin(double s)
	{
		double res;
		System.out.println("Function to find the sine of a number");
		res=Math.sin(s);
		System.out.println("The sine value of "+s+" is: "+res);
	}
	void cos(double o)
	{
		double res;
		System.out.println("Function to find the cos of a number");
		res=Math.cos(o);
		System.out.println("The cos value of "+o+"is: "+res);
	}
}
class math_test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		math m = new math();
		System.out.println("========================================");
		System.out.println("Basic Methods");
		System.out.println("========================================");
		System.out.println("1. Square Root of a number");
		System.out.println("Enter a decimal value: ");
		double x=sc.nextDouble();
		m.root(x);
		System.out.println("----------------------------------------");
		System.out.println("2. Ceiling of a number");
		System.out.println("Enter a decimal value: ");
		double y=sc.nextDouble();
		m.ceil(y);
		System.out.println("----------------------------------------");
		System.out.println("3. Floor of a number");
		System.out.println("Enter a decimal value: ");
		double z=sc.nextDouble();
		m.floor(z);
		System.out.println("----------------------------------------");
		System.out.println("4. Maximum of 2 numbers");
		System.out.println("Enter 2 values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		m.max(a,b);
		System.out.println("========================================");
		System.out.println("Logarithmic Methods");
		System.out.println("========================================");
		System.out.println("5. Log of a number");
		System.out.println("Enter a floating value: ");
		double l=sc.nextDouble();
		m.log(l);
		System.out.println("----------------------------------------");
		System.out.println("6. Exponent of a number");
		System.out.println("Enter a floating value: ");
		double k=sc.nextDouble();
		m.exp(k);
		System.out.println("========================================");
		System.out.println("Trignometric Math Methods");
		System.out.println("========================================");
		System.out.println("7. Sine of a number");
		System.out.println("Enter a floating value: ");
		double d=sc.nextDouble();
		m.sin(d);
		System.out.println("----------------------------------------");
		System.out.println("8. Cos of a number");
		System.out.println("Enter a floating value: ");
		double f=sc.nextDouble();
		m.cos(f);
		System.out.println("========================================");
		System.out.println("THE END");
		System.out.println("========================================");
	}
}
		