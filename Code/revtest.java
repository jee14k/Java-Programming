import java.util.*;
class rev
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
		int rs=0,k;
		for(int i=0;i<3;i++)    //length?
		{
			k = m%10;
			m = m/10;
			rs=(rs*10)+k;
		}
		disp(rs);
	}
	void disp(int rs)
	{
		System.out.println("The reverse of the digits are: "+rs);
	}
}
class revtest
{
	public static void main(String[] args) 
	{
		rev r = new rev();
		r.accept();
	} 
}