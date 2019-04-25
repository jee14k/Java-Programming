import java.util.*;
class STRING
{
	void len(String s)
	{
		int l;
		l=s.length();
		System.out.println("The length of the string is: "+l); 	
	}
	void vow(String v)
	{
		int ctr=0;
		for(int i=0;i<v.length();i++)
		{
			if(v.charAt(i)=='A'||v.charAt(i)=='a')
				ctr++;
			else if(v.charAt(i)=='E'||v.charAt(i)=='e')
				ctr++;
			else if(v.charAt(i)=='I'||v.charAt(i)=='i')
				ctr++;
			else if(v.charAt(i)=='O'||v.charAt(i)=='o')
				ctr++;
			else if(v.charAt(i)=='U'||v.charAt(i)=='u')
				ctr++;
		}
		System.out.println("The number of vowels present in the string is: "+ctr);
	}
	void largeblock(String b)
	{
			
	} 
}
class STRING_TEST
{
	public static void main(String args[]) throws Exception
	{
		int opt;
		char ch;
		String str;
		Scanner sc = new Scanner(System.in);
		STRING s = new STRING();
		do
		{
			System.out.println("*************************************");
			System.out.println("PROGRAM USING STRINGS");
			System.out.println("*************************************");
			System.out.println("1. To find the length of the string");
			System.out.println("2. To find the number of vowels in the string");
			System.out.println("3. To find the length of the largest block in a string");
			System.out.println("--------------------------------------------------------");
			System.out.println("Enter your choice: ");
			opt=sc.nextInt();
			do
			{
				System.out.println("Enter a string: ");
				str=sc.next();
			}while(str.isEmpty());
			switch(opt)
			{
				case 1: s.len(str);
			           	           break;
				case 2: s.vow(str);
			           	           break;
				case 3:s.largeblock(str);
				           break; 
				default: System.out.println("INVALID OPTION!!!");  
			}
			System.out.println("Do you want to continue?(Y/N): ");
			ch=(char)System.in.read();	 
		}while(ch=='Y'||ch=='y');
	}
}