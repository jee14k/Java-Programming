import java.util.*;
class strfunctest
{
	public static void main(String args[]) throws Exception
	{
		String str="",str1,old,w,newstring="",tstring="",v;
		int i=0,ch,count=0,ind;
		char opt;
		Scanner sc = new Scanner(System.in);
		strfunc s = new strfunc();
		System.out.println("================================================");
		System.out.println("PROGRAM TO IMPLEMENT OPERATIONS ON STRINGS");
		System.out.println("================================================");
		while(str.isEmpty())
		{
			System.out.println("Enter a string: ");
			str=sc.nextLine();
		}	
		do
		{
			System.out.println("----------------------------------------");
			System.out.println("1. Function to find the length of a string");
			System.out.println("2. Function to convert String to Lower case");
			System.out.println("3. Function to convert String to Upper Case");
			System.out.println("4. Function to trim the left & Right Spaces in the String");
			System.out.println("5. Function to intern the String");
			System.out.println("6. Function to replace the String");
			System.out.println("7. Function to concat two Strings");
			System.out.println("8. Function to perform substring operation");
			System.out.println("9. Function to find the character value for an index");
			System.out.println("10. Function to compare 2 Strings");
			System.out.println("11. Function to check if the character is present or not");
			System.out.println("------------------------------------------------");
			System.out.println("From the menu, what would you like to do?: ");
			ch=sc.nextInt();
			switch(ch)
			{
			   case 1:System.out.println("----------------------------------------");
			       	  s.length(str);
			   		  break; 
				case 2:System.out.println("----------------------------------------");
				       s.lower(str);
				       break;
				case 3:System.out.println("----------------------------------------");
			           s.upper(str);
				       break;
				case 4:System.out.println("----------------------------------------");
				       s.trim(str);
				       break;
				case 5:System.out.println("----------------------------------------");
				       s.intern(str);
				       break;
				case 6:System.out.println("----------------------------------------");
				       System.out.println("The String is: "+str);
				       System.out.println("Which part of the String do you want to replace: ");
		               old=sc.next();
		               System.out.println("What do you want to replace "+old+" with?: ");
		               w=sc.next();
		               newstring = s.repnew(str,old,w);
		               break;
		    	case 7:System.out.println("----------------------------------------");
		               System.out.println("Enter the new string to concat: ");
				       str1=sc.next();
				       s.concat(str,str1);
				       break;
				case 8:System.out.println("----------------------------------------");
					   System.out.println("The String is: "+newstring);	
					   while (count!=1) 
					   {
					   		System.out.println("From which index would you like to perform substring?: ");
				       		i=sc.nextInt();	
				       		if(i<newstring.length())
					   		{	
					   			count=1;
					   		}
					   		else
					   		{
					   			System.out.println("VALUE EXCEEDING OR PRECEEDING LENGTH OF STRING");
					   		}
						}
					   	s.subst(newstring,i);
					    break;
				case 9:System.out.println("----------------------------------------");
					   System.out.println("The old string is: "+str);
					   System.out.println("----------------------------------------");
					   System.out.println("Enter the index: ");
					   ind=sc.nextInt();
					   s.charat(ind,str);
					   break;
				case 10:System.out.println("----------------------------------------");
						System.out.println("The 1st String is: "+str);
						System.out.println("Enter the 2nd String: ");
						tstring=sc.next();
						s.cmp(str,tstring);
						break;
				case 11:System.out.println("----------------------------------------");
						System.out.println("The 1st String is: "+str);
						System.out.println("Enter the value to check if present: ");
						v=sc.next();
						s.cont(str,v);
						break;
				default:System.out.println("INVALID OPTION!!!");
			}
			System.out.println("========================================");
			System.out.println("Would you like to continue?(Y/N): ");
			opt=(char)System.in.read();
		}while(opt=='Y'||opt=='y');
		System.out.println("============================================");
		System.out.println("\tTHE END");
		System.out.println("=============================================");
	}
}
class strfunc
{
	void length(String str)
	{
		int len;
		len = str.length();
		System.out.println("The Length of the String is: "+len); 
	}
	void lower(String l)
	{
		String ul;
		ul=l.toLowerCase();
		System.out.println("The new string is: "+ul);
	}
	void upper(String u)
	{
		String ll;
		ll=u.toUpperCase();
		System.out.println("The new String is: "+ll);
	}
	void trim(String t)
	{
		String tr;
		tr=t.trim();
		System.out.println("String after trimming is: "+tr);
	}
	void intern(String tern)
	{
		String z;
		z=tern.intern();
		System.out.println("The String after interning is: "+z);
	}
	String repnew(String rep,String r,String e)
	{
		String hi;
		hi=rep.replace(r,e);
		System.out.println("The new String is: "+hi);
		return hi;
	}
	void concat(String str,String str1)
	{
		String x;
		x=str.concat(str1);
		System.out.println("The concatenated String is: "+x);
	}
	void subst(String str,int y)
	{
		String n;
		n=str.substring(y);
		System.out.println("The string after performing substring is: "+n);
	}
	void charat(int n,String str)
	{
		char v;
		v = str.charAt(n);
		System.out.println("The value at index number "+n+" is: "+v);
	}
	void cmp(String str,String w)
	{
		if(str.compareTo(w)>0)
			System.out.println("The 1st String is greater than the 2nd");
		else if(str.compareTo(w)<0)
			System.out.println("The 1st string is smaller than the 2nd");
		else
			System.out.println("Both the Strings are equal");
	}
	void cont(String s1,String s2)
	{
		if(s1.contains(s2))
			System.out.println("The value "+s2+" is present in: "+s1);
		else
			System.out.println("The value is not present");
	}
}