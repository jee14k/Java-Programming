import java.io.*;
class Product
{
	void num()
	{
		int x=20, y=5,p=0;
		p=x*y;
		System.out.println("Product= "+p);
 	}
 	public static void main(String args[])
 	{
 		Product obj=new Product();
 		obj.num();
 	}
}