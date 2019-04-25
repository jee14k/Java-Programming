import java.util.*;
class Comm
{
	Scanner sc = new Scanner(System.in);
	boolean check(int n1,int n2)
	{
		char ch1[]=new char[n1],ch2[]=new char[n2];
		System.out.println("Enter the characters in the 1st array: ");
		for(int i=0;i<n1;i++)
			ch1[i] = sc.nextLine().charAt(0);
		System.out.println("Enter the characters in the 2nd array: ");
		for(int i=0;i<n2;i++)
			ch2[i] = sc.nextLine().charAt(0);
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(ch1[i]==ch2[j])
				{
					return true;
					//break;
				}
				else
				{
                      if(i==n1-1)
                      	return false;
                      else
                      	continue;
				}
			}
		}
		return false;
	}
}
class Commtest
{
	public static void main(String[] args) 
	{
		boolean t;
		int n1,n2;
		Comm c = new Comm();
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to check whether there are common alphabets in the array");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Enter the number of characters in the 1st array: ");
		n1 = sc.nextInt();
		System.out.println("Enter the number of characters in the 2nd array: ");
		n2 = sc.nextInt();
		t = c.check(n1,n2);
		if(t==true)
			System.out.println("TRUE!");
		else
			System.out.println("FALSE!");
	}
}