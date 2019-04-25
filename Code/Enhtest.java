import java.util.*;
class Enh
{
	void cond()
	{
		int numarray[5]={56,25,78,90,110};
		for(int k:numarray)
		{
			System.out.println(k);
		}
	}
}
class Enhtest
{
	public static void main(String[] args) 
	{
		Enh e = new Enh();
		e.cond();	
	}
}