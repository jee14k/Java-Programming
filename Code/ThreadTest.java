class First extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("First Thread: "+i);
			try
			{
				sleep(1000);	//1000ms = 1 second delay
			}
			catch(Exception e)
			{
				System.out.println("Exception block");
			}
			finally
			{
				System.out.println("Finally block");
			} 
		}
	}
}
class Second extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			System.out.println("Second Thread: "+i);
			try
			{
				yield();
			}
			catch(Exception e)
			{
				System.out.println("Exception block in 1st thread");
			}
			finally
			{
				System.out.println("Finally block in 2nd thread");
			}
		}
	}
}
class ThreadTest
{
	public static void main(String[] args) 
	{
		First t1 = new First();
		Second t2 = new Second();
		t1.start();											// thread is not created
		for(int i=30;i<=40;i++)
		{
			System.out.println("Main Thread: "+i);			
		}									
		t2.start();											// starting 2nd thread (3 threads are running)
	}
}