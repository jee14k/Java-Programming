class Complex
{
	int real,img;
	Complex()
	{}
	Complex(int real,int img)
	{
		this.real = real;
		this.img = img;
	}
	void setimg(int img)
	{
		this.img=img;
	}
	void setreal(int real)
	{
		this.real = real;
	}
	Complex add(Complex other)
	{
		Complex t = new Complex();
		t.setimg(img+other.img);
		t.setreal(real+other.real);
		return t;
	}
	Complex sub(Complex other)
	{
		Complex t = new Complex();
		t.real = real - other.real;
		t.img = img - other.img;
		return t;
	}
	Complex mul(Complex other)
	{
		Complex t = new Complex();
		t.real = real * other.real - (img*other.img);
		t.img = real * other.img + (img*other.real);
		return t;
	}
	void display()
	{
		System.out.println("Real part = "+real);
		System.out.println("Imaginary part = "+img);
	}
}
class complextest
{
	public static void main(String[] args) 
	{
		Complex a = new Complex(5,6);
		Complex b = new Complex(7,8);
		Complex c;
		c = a.add(b);
		System.out.println("After adding : ");
		c.display();	
		c = a.sub(b);
		System.out.println("After subtracting : ");
		c.display();
		c = a.mul(b);	
		System.out.println("After multiplying : ");
		c.display();
	}
}