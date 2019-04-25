import java.util.*;
class Type
{
	byte caste(int m)
	{	
		byte n=(byte)m;
		return n;
	}
	int conv(byte m)
	{
		int n = m;
		return n;
	}
}
class TypeTest
{
	public static void main(String[] args)throws Exception
	{
		Scanner sc = new Scanner(System.in);
		Type t = new Type();
		char ch;
		do
		{
			int m;
			byte n;
			byte l;
			int p;
			System.out.println("TYPE CASTING & TYPE CONVERSION");
			System.out.println("--------------------------------");
			System.out.println("Enter an integer: ");
			m = sc.nextInt();
			n = t.caste(m);
			System.out.println("The byte value of "+m+" is: "+n);
			System.out.println("Enter a byte value in integer: ");
			l = sc.nextByte();
			p = t.conv(l);
			System.out.println("The integer value of "+l+" is: "+p);
			System.out.println("Do you want to continue?(Y/N): ");
			ch=(char)System.in.read();
		}while(ch=='Y'||ch=='y');	
	}
}