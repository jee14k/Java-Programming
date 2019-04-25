import java.util.*;
class StringUnique
{
	boolean isUnique(String str)
	{
		for(int i=0; i<str.length()-1; i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(str.charAt(i)==str.charAt(j))
					return false;
			}
		}
		return true;
	}
}
class StringUniquetest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String inp;
		System.out.println("Enter a string: ");
		inp=sc.nextLine();
		StringUnique s1 = new StringUnique();
		if(s1.isUnique(inp))
			System.out.println("String is Unique");
		else
			System.out.println("String is not unique");
	}
}