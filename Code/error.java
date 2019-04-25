import java.io.*;
import java.util.*;
class NoMatchException extends Exception
{
	NoMatchException(String str)
	{
		super(str);
	}
} 
class error
{
	public static void main(String args[]) throws Exception
	{
		Scanner ob=new Scanner(System.in);
		try
		{
			System.out.println("enter the string");
			String name=ob.nextLine();
			if(!name.equals("CHRIST")) throw new NoMatchException("Name mismatch");
			System.out.println("Equals");
		}
		catch(NoMatchException e)
		{
			System.out.println("Invalid");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("First Finally block");
		}
		int a[]={5,10};
		int b=5,c=5;
		try
		{
			//int x=6/(b-c);
			//b=Integer.parseInt(ob.nextLine());
			a[2]=8;
			System.out.println("code will not be executed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
		catch(NumberFormatException e)
		{
			System.out.println("wrong format");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index error");
		}
		catch(ArrayStoreException e)
		{
			System.out.println("Wrong data type");
		}
		finally
		{
			System.out.println("Second Finally block");
		}
		int y=a[1]/a[0];
		System.out.println("y="+y); 
	}
}          
