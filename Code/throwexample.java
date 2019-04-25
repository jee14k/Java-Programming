public class throwexample
{
	int division(int a,int b) throws ArithmeticException
	{
		int t = a/b;	
		return t;
	}
	public static void main(String agrs[])
	{
		throwexample obj = new throwexample();
		try
		{
			System.out.println(obj.division(15,0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("You shouldn't divide number by 0!");
		}
	}
}