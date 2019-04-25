abstract class Base 
{
	Base()
	{
		System.out.println("Base Constructor Called");
	} 
	Base(int x)
	{
		System.out.println(x);
	}
	abstract void display(); 
}	 
class Derived extends Base 
{
	Derived() 
	{ 
		System.out.println("Derived Constructor Called"); 
	} 
	Derived(int x,int y)
	{
		super(y);
		System.out.println(x);
	}
	void display()
	{
		System.out.println("Derived fun() called");
	} 
} 
class abstracttest
{ 
 	public static void main(String args[]) 
	{  
   		Derived d = new Derived();
		Derived d1=new Derived(10,20); 
		Base b;
		b=new Derived(40,50); //What is the difference?
   	} 
}