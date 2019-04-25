import java.util.*;
class cap
{
	static String capital(String str)
	{
		String words[]=str.split("\\s");
		String result="";
		for(String strng:words)
		{
			String first=strng.substring(0,1);
			System.out.println("First = "+first);
			String rem = strng.substring(1);
			System.out.println("Rem = "+rem);
			result=result+first.toUpperCase()+rem+" ";
			System.out.println("Result = "+result);
		}
		result.trim();
		return result;
	}
}
class captest
{
	public static void main(String args[])
	{
		cap ob = new cap();
		System.out.println(ob.capital("hai i am jeevan"));
	}
}