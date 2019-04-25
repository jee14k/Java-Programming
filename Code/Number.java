import java.io.*;
class Number
{
	void sum()
	{
		int a=5, b=6,sum=0;
		sum=a+b;
		System.out.println("sum="+sum);
	}
	public static void main(String args[])
	{
		Number ob=new Number();
		ob.sum();
	}
}