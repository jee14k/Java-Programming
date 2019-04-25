class longsub
{
	String str;
	int len;
	String result;
	longsub()
	{
		str = null;
		len = 0;
		result = null;
	}
	void read(String s)
	{
		str = s;
		len = str.length();
	}
	String longs()
	{
		String t1 = null;
		String t2 = null;
		for(int i=1;i<=(len/2);i++)
		{
			t1 = str.substring(0,i);
			System.out.println("t1="+t1);
			t2 = str.substring(str.length()-i);       //everything from length - i
			System.out.println("t2="+t2);
			if(t1.equals(t2))
			{
				result = t1;
				System.out.println("result="+result);
			}
		}
		return result;
	}
}
class longsubtest
{
	public static void main(String args[])
	{
		longsub s = new longsub();
		s.read("abcdefab");
		System.out.println(s.longs());
	}
}