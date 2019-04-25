import java.util.*;
import java.util.Arrays;
class array
{
	int arr[],no=0,arr1[],mo=0,o,b;
	Scanner s = new Scanner(System.in);
	void ins()
	{
		int num,m,y,n=0;
		char ch;
		if(no!=0)
		{
			System.out.println("Would you like to add elements to the 1st array?(0=No/1=Yes): ");
			y=s.nextInt();
			if(y==1)
			{
				System.out.println("How many more elements do you want to add?: ");
				n=s.nextInt();
				b=no+n;
				System.out.println("Enter "+n+" elements more: ");
				arr=Arrays.copyOf(arr,b);
				for(int x=no;x<b;x++)
				{
					arr[x]=s.nextInt();
				}
				no=arr.length;
			}
		}
		if(no==0)
		{
			System.out.println("Enter the number of elements in the array: ");
			num = s.nextInt();
			arr=new int[num];
			no=num;
			System.out.println("Enter "+num+" elements to the array: ");
			System.out.println("------------------------------------------------");
			for(int i=0;i<no;i++)
			{
				arr[i]=s.nextInt();
			}
			System.out.println("------------------------------------------------");
			System.out.println("Would you like a 2nd array?(0=No/1=Yes): ");
			o=s.nextInt();
			if(o==1)
			{
				System.out.println("Enter the number of elements in the 2nd array: ");
				m = s.nextInt();
				arr1 = new int[m];
				mo = m;
				System.out.println("Enter "+m+" elements to the 2nd array: ");
				for(int p=0;p<mo;p++)
				{
					arr1[p]=s.nextInt();
				}
			}
		}
	}
	void disp()
	{
		if(no!=0)
		{
			System.out.println("The 1st array is: ");
			for(int j=0;j<no;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println(" ");
		}
		else
			System.out.println("1st Array is Empty!!");		
		if(mo!=0)
		{
			System.out.println("The 2nd array is: ");
			for(int z=0;z<mo;z++)
			{
				System.out.println(arr1[z]+" ");
			}
			System.out.println(" ");
		}
		else
			System.out.println("2nd Array is Empty!!");		
	}
	void del()
	{
		int pos=0,q=1;
		disp();
		if(mo!=0)
		{
			System.out.println("Which array would you like to delete from? (1/2): ");
			q=s.nextInt();
		}
		if(mo!=0||no!=0)
		{
			System.out.println("------------------------------------------------");
			System.out.println("Deleting by Position");
			if(q==1)
			{
				System.out.println("Enter the position you want to delete: ");
				pos=s.nextInt();
				for(int k=pos-1;k<no-1;k++)
				{
					arr[k]=arr[k+1];
				}
				no--;
				disp();
			}
			else if(q==2)
			{
				System.out.println("Enter the position you want to delete: ");
				pos=s.nextInt();
				for(int k=pos-1;k<mo-1;k++)
				{
					arr1[k]=arr1[k+1];
				}	
				mo--;
				disp();
			}
			else
				System.out.println("THERE ARE ONLY 2 ARRAYS!!");
		}
	}		
	void linsearch()
	{
		int el,flag,b=1;
		disp();
		if(mo!=0)
		{
			System.out.println("Which array would you like to search the element?(1/2): ");
			b=s.nextInt();
		}
		if(mo!=0||no!=0)
		{
			if(b==1)
			{
				System.out.println("Enter the element to be searched: ");
				el=s.nextInt();
				flag=0;
				for(int i=0;i<no;i++)
				{
					if(arr[i]==el)
					{
						System.out.println("Element found in position "+(i+1));
						flag=1;
					}		
				}
				if(flag==0)
					System.out.println("Element not found");
			}
			else if(b==2)
			{
				System.out.println("Enter the element to be searched: ");
				el=s.nextInt();
				flag=0;
				for(int i=0;i<mo;i++)
				{
					if(arr1[i]==el)
					{
						System.out.println("Element found in position "+(i+1));
						flag=1;
					}	
				}
				if(flag==0)
					System.out.println("Element not found");
			}
			else
				System.out.println("THERE ARE ONLY 2 ARRAYS!!");
		}
	}
	void sort()
	{
		int c=1;
		if(mo!=0)
		{
			System.out.println("Which array would you like to sort?(1/2): ");
			c=s.nextInt();
		}
		if(no!=0||mo!=0)
		{
			if(c==1)
			{
				Arrays.sort(arr);
			}
			else if(c==2)
			{
				Arrays.sort(arr1);	
			}
			else
				System.out.println("THERE ARE ONLY 2 ARRAYS!!!");
		}
		disp();
		System.out.println("--------------------------");
	}
}
class arraytest
{
	public static void main(String args[]) throws Exception
	{
		int ch,n,opt;
		Scanner sc = new Scanner(System.in);
		array a = new array();
		do
		{
			System.out.println("================================================");
			System.out.println("PROGRAM TO IMPLEMENT THE WORKING OF ARRAYS");
			System.out.println("================================================");
			System.out.println("1. Insertion");
			System.out.println("2. Deletion");
			System.out.println("3. Linear Search");
			System.out.println("4. Sort");
			System.out.println("5. Display");
			System.out.println("------------------------------------------------");
			System.out.println("From the menu, what would you like to do?: ");
			ch=sc.nextInt();
			System.out.println("You have chosen option number: "+ch);
			System.out.println("------------------------------------------------");
			switch(ch)
			{
				case 1: a.ins(); 
						break;
				case 2: a.del();
						break;
				case 3: a.linsearch();
						break;
				case 4: a.sort();
						break;
				case 5: a.disp();
						break;
				default: System.out.println("INVALID OPTION!!!");
			}
			System.out.println("========================================");
			System.out.println("Would you like to continue?(Y/N): ");
			opt=(char)System.in.read();
		}while(opt=='Y'||opt=='y');
	}
}