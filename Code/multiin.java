class a
{
	int x;
	a()
	{
		x=10;
	}
	void disp()
	{
	System.out.println("x="+x);
	}
}
class b extends a
{
	int y;
	b()
	{
		y=20;
	}
	void disp()
	{
		super.disp();
		System.out.println("y="+y);
	}
}
class c extends b
{
	int z;
	c()
	{
		z=30;
	}
	void disp()
	{
		super.disp();
		System.out.println("z="+z);
	}
}
class multiin
{
	public static void main(String a[])
	{
		c s=new c();
		s.disp();
	}
}