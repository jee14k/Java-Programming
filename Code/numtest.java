import java.util.*;
class num
{
	Scanner sc = new Scanner(System.in);
	void accept()
	{
		int m;
		System.out.println("Enter a number: ");
		m = sc.nextInt();
		calc(m);
	}
	void calc(int m)
	{
		int sum=0,k;
		for(int i=0;i<5;i++)	//length?
		{
			k = m%10;
			m = m/10;
			sum=sum+k;
		}
		disp(sum);
	}
	void disp(int s)
	{
		System.out.println("The sum of the digits are: "+s);
	}
}
class numtest
{
	public static void main(String[] args) 
	{
		num n = new num();
		n.accept();
	} 
}