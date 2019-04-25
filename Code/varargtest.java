class vararg
{
	int a,b,c;
	void read(int ...arr)
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}
class varargtest
{
	public static void main(String args[])
	{
		vararg s = new vararg();
		s.read(1);
		s.read(2,2,2);
		s.read(3,3,3,3);
	}
}