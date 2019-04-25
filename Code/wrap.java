class wrap
{
	public static void main(String []args)
	{
		Integer I = Integer.valueOf(10);	//I=10
		Integer J = Integer.valueOf("1111",2);	//I=15
		Integer K = Integer.valueOf("10");	//I=10
		Integer L = new Integer(130);
		//int n = L.intvalue();
		//System.out.println(n);	//n=130
		String s="12";
		int k = Integer.parseInt(s);
		System.out.println("k="+k);
		int i = Integer.parseInt("1000",2);
		System.out.println("i="+i);	//8
		int m=14;
		String s2 = Integer.toString(m);
		System.out.println("s2="+s2);
		String s3 = Integer.toString(6,2);	//110
		System.out.println("s3="+s3);
		String s1 = Long.toString(11,6);	//b
		System.out.println("s1="+s1);
		Integer z = new Integer(100);
		int z1 = z;		//Unboxing
		System.out.println("z1="+z1);
		Integer z2;
		z2=z1;		//Autoboxing
		System.out.println("z2="+z2.intValue());
	}
}