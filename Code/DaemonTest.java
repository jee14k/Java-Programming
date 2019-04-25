class WorkerThread1 extends Thread
{
	public WorkerThread1()
	{
		setDaemon(true);
	}
	public void run()
	{
		int count = 0;
		while(true)
		{
			System.out.println("Hello from Worker1 "+count++);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class WorkerThread2 extends Thread
{
	public void run()
	{
		int count = 0;
		while(true)
		{
			System.out.println("Hello from Worker2"+count++);
			try
			{
				sleep(1200);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
public class DaemonTest
{
	public static void main(String[] args) {
		new WorkerThread1().start();
		WorkerThread2 t1 = new WorkerThread2();
		t1.setDaemon(true);
		t1.start();
		try
		{
			Thread.sleep(7500);
		}
		catch(InterruptedException e) {}
		System.out.println("Main Thread ending");
	}
}