import java.io.*;
class Sum
{
	void num()
	{
		int a=2, b=5, x=0;
		x=a+b;
		System.out.println("sum = "+x);
	}
	public static void main(String args[])
	{
		Sum obj = new Sum();
		obj.num();
	}
}