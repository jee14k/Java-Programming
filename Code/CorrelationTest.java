import java.util.*;
abstract class student
{
	static int[] attendance=new int[10];
	static int[] marks=new int[10];
	static int n;
	static Scanner sc=new Scanner(System.in);
	static void read()
	{
		System.out.println("Enter number of subjects: ");
		n = sc.nextInt();
		System.out.println("Enter the attendance & marks for "+n+" subjects respectively: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter attendance: ");
			attendance[i]=sc.nextInt();
			System.out.println("Enter marks: ");
			marks[i]=sc.nextInt();
		}
	}
	static void display()
	{
		System.out.println("The attendace & marks for "+n+" students are: ");
		System.out.println("----------------------------------------------");
		System.out.println("NUMBER \t ATTENDACE \t MARKS ");
		System.out.println("----------------------------------------------");
		for(int i = 0;i<n;i++)
		{
			System.out.println(+(i+1)+"\t   "+attendance[i]+"\t   \t"+marks[i]);
		}		
		System.out.println("----------------------------------------------");
	}
}
class Correlation extends student
{
	static double correlation()
	{
		int attmarks = 0,att=0,ma=0,sqma=0,sqatt=0,sma=0,satt=0;
		double r;
		read();
		display();
		for (int i = 0;i<n ;i++) 
		{
			att = att + attendance[i];	
		}
		for(int i = 0;i<n;i++)
		{
			attmarks = attmarks + (attendance[i]*marks[i]);
		}
		for(int i=0;i<n;i++)
		{
			ma = ma + marks[i];
		}
		for(int i=0;i<n;i++)
		{
			sqma = sqma + (marks[i])^2;
		}
		for(int i=0;i<n;i++)
		{
			sqatt = sqatt + (attendance[i])^2;
		}
		sma = ma^2;
		satt = att^2;
		r = ((n*attmarks)-(att*ma))/Math.sqrt(((n*sqma)-sma)*((n*sqatt)-satt));
		System.out.println("Correlation is: ");
		return r; 
	}
}
public class CorrelationTest
{
	public static void main(String arg[])
	{
		System.out.println(Correlation.correlation());
	}
}