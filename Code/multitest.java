class table
{
	synchronized void multitable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + "*"+n+"="+i*n);
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class thread1 extends Thread
{
	int k;
	table t;
	thread1(table t,int k)
	{
		this.t=t;
		this.k=k;
	}
	public void run()
	{
		t.multitable(k);
		for(int j=1;j<=10;j++)
		{
			System.out.println("Inside thread one"+j);
		}
	}
}
class thread2 extends Thread
{
	int k;
	table t;
	thread2(table t,int k)
	{
		this.t=t;
		this.k=k;
	}
	public void run()
	{
		t.multitable(k);
		for(int j=1;j<=10;j++)
		{
			System.out.println("Inside thread two"+j);
		}
	}
}
class multitest
{
	public static void main(String[] args) {
		table t = new table();
		thread1 t1 = new thread1(t,5);
		thread2 t2 = new thread2(t,8);
		t1.start();
		t2.start();
	}
}