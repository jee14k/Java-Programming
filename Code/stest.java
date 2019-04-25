import java.util.*;
class student
{
	String name;
	String cl;
	int regno;
	student()
	{
		name="Don";
		regno=1;
		cl="MBA";
	}
	student(String a,int b,String c)
	{
		name=a;
		regno=b;
		cl=c;
	}
	void read()
	{
		Scanner sc = new Scanner(System.in);
		name=sc.next();
		regno=sc.nextInt();
		cl=sc.next();
	}
	void disp()
	{
		System.out.println(name);
		System.out.println(regno);
		System.out.println(cl);
	}
}
class marks extends student
{
	int sub1;
	int sub2;
	int sub3;
	marks(String a,int b,String c,int s1,int s2,int s3)
	{
		super(a,b,c);
		sub1=s1;
		sub2=s2;
		sub3=s3;
	}
	void readmarks()
	{
		read();
		Scanner sc = new Scanner(System.in);
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
	}
	void disp()
	{
		super.disp();
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}
}
class stest
{
	public static void main(String a[])
	{
		marks s = new marks("Tony",1111,"Bsc",10,10,10);
		System.out.println("Initial Data");
		s.disp();
		System.out.println("Enter details");
		s.readmarks();
		System.out.println("Data Entered");
		s.disp();
	}
}