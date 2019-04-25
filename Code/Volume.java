import java.io.*;
class Volume
{
	void vox()
	{
		int l=11, b=7, h=9,v=0,x;
		x=l*b*h;
		System.out.println("volume= "+x);
	}
	public static void main(String args[])
	{
		Volume obj=new Volume();
		obj.vox();
	}
}