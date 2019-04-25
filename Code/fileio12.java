import java.io.*;
class fileio12
{
public static void main(String args[]) throws IOException
{
	FileInputStream infile=new FileInputStream("a1.txt");
	FileOutputStream outfile= new FileOutputStream ("a2.txt");
	try
	{
		int b;
		while ((b=infile.read())!=-1)
		{
			outfile.write(b);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	infile.close();
	}
}