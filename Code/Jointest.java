class Join extends Thread
{
	public void run()
	{
		System.out.println("Status = "+isAlive());
		for(int i=1;i<=10;i++)
		{
			System.out.println("Inside Thread ="+i);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class Jointest
{
	public static void main(String[] args) 
	{
		Join t1 = new Join();
		t1.start();
		try
		{
			t1.join();
			//Thread.sleep(0);
		}
		catch(InterruptedException e)
		{}
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main ="+i);
		}	
	}
}