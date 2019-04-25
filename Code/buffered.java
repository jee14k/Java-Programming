import java.io.*;
public class buffered
{
	public static void main(String[] args)throws Exception 
	{
		FileOutputStream fout = new FileOutputStream("4cms1.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to CHRIST(Deemed to be university), Bangalore";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.write(System.getProperty("line.separator").getBytes());
		bout.write(b,11,6);
		bout.write(System.getProperty("line.separator").getBytes());
		for(int i=65;i<75;i++)
		{
			bout.write(i);
		}	
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
	}
}