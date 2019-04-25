import java.util.*;
class name
{
	void display(String n)
	{
		System.out.println("Your name is: "+n);
	}
}
class name_test
{
	public static void main(String args[])
	{
		name n = new name();
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("---------------------------------");
		System.out.println("PRINTING YOUR NAME 10 TIMES WITHOUT A LOOP");
		System.out.println("---------------------------------");
		System.out.println("Enter your name: ");
		name = sc.next();
		n.display(name);
		n.display(name);
		n.display(name);
		n.display(name);
		n.display(name);
		n.display(name);
		n.display(name);
		n.display(name);
		n.display(name);
		n.display(name);
	}
}