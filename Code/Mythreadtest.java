class Mythread implements Runnable
{
	Thread t;
	Mythread()
	{
		t = new Thread(this);
		t.start();          // start automatically class run method
	}
	public void run()
	{
		for (int i=1;i<10;i++) 
		{
			System.out.println(i);	
		}
	}
}
class Mythreadtest 
{
	public static void main(String[] args) 
	{
		Mythread m = new Mythread();	
	}
}