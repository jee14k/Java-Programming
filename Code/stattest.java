class stat
{
	static int a;
	stat()
	{
		a=10;
	}
	static float av(int k)
	{
		return (a/k);
	}
	void set(int k)
	{
		a=k;
	}
	void disp()
	{
		System.out.println(a);
	}
}
class stattest
{
	public static void main(String[] args) 
	{
		stat s1=new stat();
		stat s2=new stat();
		stat s3=new stat();
		s1.disp();
		s2.set(50);
		s1.disp();
		s2.set(60);
		s3.disp();
		System.out.println(stat.av(3));
	}
}