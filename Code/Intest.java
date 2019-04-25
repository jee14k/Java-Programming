import java.util.*;
import java.util.Arrays;
interface InStack
{
	void push(int item);
	int pop();
	void display();
}
class FixedStack implements InStack
{
	Scanner s = new Scanner(System.in);
	int n = 3;
	int top=-1,pos;
	int fa[] = new int[n];
	public void push(int item)
	{
		if(top>=n)
		{
			System.out.println("Stack Overflow");
			return;
		}
		else if(top<n-1)
		{
			top++;
			fa[top]=item;
		}
	}
	public int pop()
	{
		System.out.println("The element which is popped from the Fixed Stack is: "+fa[top]);
		if(top>-1)
		{
			pos = top--;
		}
		return pos;
	}
	public void display()
	{
		System.out.println("The fixed stack is:");
		if(top==-1)
			System.out.print("Empty!\n");
		else if(top!=-1)
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(" "+fa[i]);
			}
		}
		else if(top>n)
			System.out.print("Full!");
	}
}
class DynamicStack extends FixedStack
{
	int t=-1,p;
	int da[] = new int[10];
	public void push(int item)
	{
		t++;
		System.out.println("t = "+t);
		System.out.println("n = "+n);
		if(t<n)
		{
			super.push(item);
		}
		else
		{
			n++;
			da[t] = item;	
		}
	}
	public int pop()
	{
		super.pop();
		System.out.println("The element which is popped from the Dynamic Stack is: "+da[t]);
		p=t--;
		return p;
	}
	public void display()
	{
		super.display();
		System.out.println("The dynamic stack is:");
		for(int i=0;i<fa.length;i++)
		{
			da[i]=fa[i];
		}
		for(int i=t;i>=0;i--)
		{
			System.out.println(" "+da[i]);
		}
	}
} 
class Intest 
{
	public static void main(String[] args)
	{
		FixedStack f = new FixedStack();
		DynamicStack d = new DynamicStack();
		Scanner sc = new Scanner(System.in);
		int opt,ele,value,v,n;
		char ch='n';
		do
		{
			System.out.println("Program to implement the use of Stack");
			System.out.println("-------------------------------------");
			System.out.println("1. Push \n\n2. Pop \n\n3. Display");
			System.out.println("-------------------------------------");
			System.out.println("Enter your choice: ");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1: System.out.println("Enter the element to push: ");
						ele = sc.nextInt();
						d.push(ele);
						d.display();
						break;
				case 2: value = d.pop();
						d.display();
						break;
				case 3: d.display();
						break;
				default:System.out.println("Wrong choice!");
			}
			System.out.println("Do you want to continue?(Y/N): ");
			try{
				ch = (char)System.in.read();
			}
			catch(Exception e)
			{}
		}while(ch=='Y'||ch=='y');
	}
}