class Mythread1 extends Thread implements Runnable
{
	public void run()
	{
		for (int i=1;i<10;i++) 
		{
			System.out.println(i);
			try
			{
				sleep(1000);
			}catch(Exception e){}
		}
	}
}
class Mythread1test 
{
	public static void main(String[] args) 
	{
		Mythread1 t = new Mythread1();
		Thread t1 = new Thread(t);
		t1.start();	
	}
}