interface Shape
{
	double PI = 3.14;	// static & final
	void draw();		//automated public
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
}
class Square extends Rectangle
{
	public void draw()
	{
		System.out.println("Square");
	}
}
class Interfacetest 
{
	public static void main(String str[]) 
	{
		Rectangle r = new Rectangle();
		r.draw();
		Square s = new Square();
		s.draw();		
	}
}