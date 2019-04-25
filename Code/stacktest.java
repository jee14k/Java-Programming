import java.io.*;
import java.util.*;
class stack
{
	int top=-1;
	int stck[] = new int[10];
	void push(int ele)
	{
		if(top==9)
			System.out.println("Stack is full. ");
		else
			stck[++top]=ele;
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow.");
			return 0;
		}
		else
			return stck[top--];
	}
	void display()
	{
		for(int i=0;i<top+1;i++)
			System.out.println(stck[i]+" ");
	}
}
class stacktest
{
	public static void main(String[] args) throws Exception
	{
		int opt,pu;
		char ch;
		Scanner sc = new Scanner(System.in);
		stack s = new stack();
		do
		{
			System.out.println("===========================================");
			System.out.println("STACK IMPLEMENTATION");
			System.out.println("===========================================");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("===========================================");
			System.out.println("What would you like to do?: ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:System.out.println("-------------------------------------");
					   System.out.println("Enter the element to push: ");
					   pu=sc.nextInt();
				   	   s.push(pu);
					   break;
				case 2:System.out.println("-------------------------------------");
					   s.pop();
					   break;
				case 3:System.out.println("--------------------------------------");
					   System.out.println("The stack is: ");
					   s.display();
					   break;
				default:System.out.println("Wrong option");
			}
			System.out.println("Do you want to continue?(Y/N): ");
			ch=(char)System.in.read();
		}while(ch=='Y'||ch=='y');
	}
}