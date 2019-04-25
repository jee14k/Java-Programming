import java.util.LinkedList;
public class Procontest
{
	public static void main(String[] args) throws InterruptedException
	{
		final Procon pc = new Procon();
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					pc.produce();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				try
				{
					pc.consume();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
	class Procon
{
	LinkedList<Integer> list = new LinkedList<>();		
	int cap = 2;
	int value = 0;
	public void produce() throws InterruptedException
	{
		while(true)
		{
			synchronized(this)
			{
				while(list.size()==cap)
					wait();
				System.out.println("Producer produced: "+value);
				list.add(value++);
				notify();
				Thread.sleep(1000);
			}
		}
	}
	public void consume() throws InterruptedException
	{
		while(true)
		{
			synchronized(this)
			{
				while(list.size()==0)
					wait();
				int val = list.removeFirst();
				System.out.println("Consumer consumed: "+value);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}
}