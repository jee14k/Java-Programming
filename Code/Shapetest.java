import java.util.*;
class Shape
{
	double sarea,l,b,s,rarea;
	Scanner sc = new Scanner(System.in);
	Shape()
	{
		sarea=0.0;
		rarea=0.0;
		l=0.0;
		b=0.0;
		s=0.0;
	}
}
class Square extends Shape
{
	void accept()
	{
		System.out.println("Enter the side of the square: ");
		s = sc.nextDouble();
	}
	void calc()
	{
		sarea = s*s;
	}
	void disp()
	{
		System.out.println("The area of the square is: "+sarea);
	}
}
class Rectangle extends Square
{
	void accept()
	{
		super.accept();
		System.out.println("Enter the length of the rectangle: ");
		l = sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle: ");
		b = sc.nextDouble();
	}
	void calc()
	{
		super.accept();
		rarea = l*b;
	}
	void disp()
	{
		super.disp();
		System.out.println("The area of the rectangle is: "+rarea);
	}
}
class Shapetest
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		r.accept();
		r.calc();
		r.disp();
	}
}