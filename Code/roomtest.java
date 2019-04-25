class room 
{
	int breadth,length;
	room(int b,int l)
	{
		breadth=b;
		length=l;
	}
	room(int x)
	{
		breadth=length=x;
	}
	int area()
	{
		return breadth*length;
	}
}
class roomtest
{
	public static void main(String args[])
	{
		room r1=new room(5,6);
		System.out.println("First Area"+r1.area());
		room r2=new room(5);		
		System.out.println("Second area"+r2.area());
	}
}