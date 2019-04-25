class Mythread1 implements Runnable
{
	public void run()
	{
		for (int i=1;i<10;i++) 
		{
			System.out.println(i);	
		}
	}
}
class Mythread1test 
{
	public static void main(String[] args) 
	{
		Mythread1 m = new Mythread1();
		Thread t1 = new Thread(t1);
		t1.start();	
	}
}