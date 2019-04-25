import java.util.*;
class patt
{
	void triangle(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(" "+k);
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print(" "+l);
			}
			System.out.println(" ");
		}	
	}
}
class patt_test
{
	public static void main(String args[])
	{
		int num;
		patt p = new patt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		p.triangle(num);
	}
}