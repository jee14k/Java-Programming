class runnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class runnabletest
{
	public static void main(String[] args) 
	{
		runnable ri = new runnable();
		Thread t1 = new Thread(ri);
		t1.start();
		Thread t2 = new Thread(new runnable());
		t2.start();
		t1.suspend();
		t1.resume();	
	}
}