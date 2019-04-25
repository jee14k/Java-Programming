import ds.stack;
class stackpackage
{
	public static void main(String[] args) 
	{
		stack s = new stack(5);
		s.push(4);
		s.push(3);
		s.display();
		System.out.println("Deleted item is: "+s.pop());
		s.display();
		s.push(14);
		s.push(24);
		s.display();
	}
}