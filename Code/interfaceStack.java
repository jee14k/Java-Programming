import java.util.*;
interface InStack
{
	void push(int item);
	public int pop();
}
class FixedStack implements InStack
{
	Scanner sc=new Scanner(System.in);
	int top=-1, n=5, ch, ele, p;
	int arr[]=new int[n];
	public void push(int pos)
	{
		if(top<n-1)
		{
			ele=pos;
			arr[++top]=ele;
		}
		else
		{
			System.out.println("\nStack overflow!");
		}
	}
	public int pop()
	{
		if (top<=-1)
			System.out.println("\nStack underflow!");
		else 
		{
			p=arr[top];
			top--;
		}
		return p;
	}
	void display()
	{
		int i;
		if(top == -1)
			System.out.println("\nStack Empty!");
		else
		{
			System.out.println("\nThe stack:");
			for(i=top; i>-1; i--)
			{
				System.out.println(arr[i]);
			}
			System.out.println("***************************");
		}
	}
	void chooseOption()
	{
		do
		{
			System.out.println("***************************");
			System.out.println("Enter your choice : ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("***************************");
			System.out.println("");
			ch=obj.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter element to be pushed : ");
					   int e=sc.nextInt();
					   push(e);
					   break;
				case 2:int popped=pop();
					   System.out.println("Element popped : "+popped);
					   System.out.println("***************************");
					   break;
				case 3:display();
					   break;
				default:System.out.println("Enter a valid choice");
			}
		}while(ch!=4);
}
class DynamicStack
{
	Scanner sc=new Scanner(System.in);
	int top=-1, ch, ele,n,p;
	int arr[];
	DynamicStack(int arrsize)
	{
		n=arrsize;
		arr=new int[n];
	}
	void push(int pos)
	{
		if(top<size-1)
		{
			int ele=pos;
			arr[++top]=ele;
		}
		else
		{
			System.out.println("\nStack overflow!");
		}
	}
	int pop()
	{
		if (top<=-1)
			System.out.println("\nStack underflow!");
		else 
		{
			p=arr[top];
			top-=1;
		}
		return p;
	}
	void display()
	{
		int i;
		if(top == -1)
			System.out.println("\nStack Empty!");
		else
		{
			System.out.println("\nThe stack:");
			for(i=top; i>-1; i--)
			{
				System.out.println(arr[i]);
			}
			System.out.println("***************************");
		}
	}
	void chooseOption()
	{
		do
		{
			System.out.println("***************************");
			System.out.println("Enter your choice : ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("***************************");
			System.out.println("");
			ch=obj.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter element to be pushed : ");
					int el=obj.nextInt();
					push(el);
					break;
				}
				case 2:
				{
					int popped=pop();
					System.out.println("Element popped : "+popped);
					System.out.println("***************************");
					break;
				}
				case 3:
				{
					display();
					break;
				}
				default:
				{
					System.out.println("Enter a valid choice");
				}
			}
		}while(ch!=4);
	}
}
class interfaceStack
{
	public static void main(String args[]) 
	{
		FixedStack f = new FixedStack();
		int ch,n=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter your choice  :");
			System.out.println("---------------------------");
			System.out.println("1. Fixed Stack");
			System.out.println("2. Dynamic Stack");
			System.out.println("3. Exit");
			System.out.println("---------------------------");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:f.chooseOption();
				       break;
				case 2:System.out.println("Enter size of the array :");
				       n=sc.nextInt();
				       DynamicStack d = new DynamicStack(n);
				       d.chooseOption();
				       break;
			}
		}while(ch!=3);
	}
}