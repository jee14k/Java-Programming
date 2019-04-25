package ds;
public class stack
{
	int a[];
	int top;
	public stack(int k)
	{
		a[]=new int[k];
		top=0;	
	}
	public void push(int k)	
	{
		top++;
		a[top]=k;
	}
	public int pop()
	{
		int k = a[top];
		top--;
		return k;
	}
	public void display()
	{
		for(int i=1;i<=top;i++)
		{
			System.out.println(a[i]);
		}
	}
}