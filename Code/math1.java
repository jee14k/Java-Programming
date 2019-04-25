import java.util.*;
class math1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================");
		System.out.println("\tMATH FUNCTION"); 
		System.out.println("================================================");
		System.out.println("\tBasic Functions");
		System.out.println("------------------------------------------------");
		System.out.println("Enter an floating value: ");
		double a=sc.nextDouble();	 
		System.out.println("The Floor value of "+a+" = "+ Math.floor(a));
		System.out.println("The Cube Root of "+ a+" = "+Math.cbrt(a));
		double c;
		System.out.println("================================================");
		System.out.println("\tLogarithmic Functions");
		System.out.println("================================================");
 		do
		{
			System.out.println("Enter a positive floating value");
			c=sc.nextDouble();
	        if(c<0)
			System.out.println("Wrong value");
		}while(c<0);
		System.out.println("The Natural logarithm of "+c+ " = "+Math.log(c));
		System.out.println("The Base 10 logarithm of "+c+ " = "+Math.log10(c));
		System.out.println("The Base 2 logarithm of "+c+" = "+ Math.log10(c)/Math.log10(2));
		System.out.println("================================================");
		System.out.println("\tTrignometric Math Methods");
		System.out.println("================================================");
		System.out.println("Enter a floating value");
		c=sc.nextDouble();
		System.out.println("The Sine value of "+c+" = "+Math.sin(Math.toRadians(c)));
		do
		{
			System.out.println("Enter a floating value between -1 and 1");
			c=sc.nextDouble();
			if(c>1||c<-1)
				System.out.println("Incorrect Input");
		}while(c>1||c<-1);
		System.out.println("The Inverse Sine value of "+c+" = "+Math.toDegrees(Math.asin(c)));
		System.out.println("================================================");
		System.out.println("\tHyperbolic Math Methods");
		System.out.println("================================================");
		System.out.println("Enter a floating value");
		c=sc.nextDouble();
		System.out.println("The Hyperbolic Sine value of "+c+" = "+Math.sinh(c));
		System.out.println("The Hyperbolic Cosine value of "+c+" = "+Math.cosh(c));
		System.out.println("================================================");
		System.out.println("\tAngular Math Methods");
		System.out.println("================================================");
		System.out.println("Enter a floating value");
		c=sc.nextDouble();
		System.out.println( c+" Radians = "+Math.toDegrees(c)+" Degrees");
		System.out.println( c+" Degrees = "+Math.toRadians(c)+" Radians");
		System.out.println("================================================");
		System.out.println("THE END");
		System.out.println("================================================");
	}
}