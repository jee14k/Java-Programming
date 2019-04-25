import java.io.*;
import java.util.*;
class scan
{
	public static void main(String[] args) 
	{
		try
		{
			File f = new File("4cms2.txt");
			PrintStream p = new PrintStream(f);
			Scanner sc = new Scanner(f);
			p.println("CHRIST");
			p.println("University");
			System.out.println(sc.nextLine());
			//System.out.println(sc.nextLine());
			System.out.println(sc.nextInt());	
		}
		catch(FileNotFoundException e){}
	}
}