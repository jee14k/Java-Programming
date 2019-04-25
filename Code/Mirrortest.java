import java.util.*;
class Mirror
{
	int arr[],n;
	void ins()
	{
		int num;
		System.out.println("Enter the number of elements in the array: ");
		num = s.nextInt();
		arr=new int[num];
		n=num;
		System.out.println("Enter "+num+" elements to the array: ");
		System.out.println("------------------------------------------------");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}	
	}
	void disp()
	{
		System.out.println("The array is: ");
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println(" ");
	}
	void maxMirror()
	{

	}
}
class Mirrortest
{
	public static void main(String[] args) 
	{
		Mirror m = new Mirror();
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("****************************************************************************");
			System.out.println("Program to find the size of the largest mirror section in the given array");
			System.out.println("****************************************************************************");
			m.ins();
			m.disp();
		}	
	}
}