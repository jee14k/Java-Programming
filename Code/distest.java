// WAP to find distance between 2 coordinates. 
import java.util.*;
class dist
{
	Scanner sc = new Scanner(System.in);
	int x1,x2,y1,y2;
	double d;
	void read()
	{
		System.out.println("Enter X's coordinates: ");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		System.out.println("Enter Y's coordinates: ");
		y1 = sc.nextInt();
		y2 = sc.nextInt();
	}
	void calc()
	{
		d = Math.sqrt(((y2-y1)^2)+((x2-x1)^2));
	}
	void disp()
	{
		System.out.println("The distance is: "+d);
	}
}
class distest
{
	public static void main(String[] args)throws Exception
	{
		char ch='y';
		do
		{
			dist d = new dist();
			d.read();
			d.calc();				
			d.disp();
			System.out.println("Do you want to continue?(Y/N): ");
			ch = (char)System.in.read();				
		}while(ch=='Y'||ch=='y');
	}
}