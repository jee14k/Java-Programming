import java.util.*;
class Perm
{
	Scanner sc = new Scanner(System.in);
	String s1,s2;
	boolean check()
	{
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
					c++;
			}
		}
		if(s2.length()==c)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void acc()
	{
		System.out.println("Enter 2 strings: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
	}
	void display()
	{
		System.out.println("The 2 strings are: ");
		System.out.println(" "+s1);
		System.out.println(" "+s2);
	}
}
class Permtest
{
	public static void main(String[] args) 
	{
		String s1,s2;
		boolean b;
		Perm p = new Perm();
		System.out.println("Program to check whether a string is a permutation of another");
		System.out.println("--------------------------------------------------------------");
		p.acc();
		p.display();
		b = p.check();
		if(b==true)
			System.out.println("True!");
		else
			System.out.println("False!");
	}
}