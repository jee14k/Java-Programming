class Shared 
{
	synchronized void test1(Shared s2)
	{
		System.out.println("test1-begin");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{}
		s2.test2(this);
		System.out.println("test1-end");
	}
	synchronized void test2(Shared s1)
	{
		System.out.println("test2-begin");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{ }
		s1.test1(this);
		System.out.println("test2-end");
	} 
}