import java.util.*;
class shift
{
	Scanner sc = new Scanner(System.in);
	int[] left(int arr[])
	{
		int x=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=x;
		return arr;
	}
	int[] accept()
	{
		int n;
		System.out.println("Enter the size of the array: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(int k=0;k<n;k++)
			arr[k]=sc.nextInt();
		return arr;
	}
	void display(int ar[])
	{
		for(int k=0;k<ar.length;k++)
			System.out.println(ar[k]+" ");
	}
}
class shifttest
{
	public static void main(String args[])
	{
		shift s=new shift();
		int a[] = s.accept();
		System.out.println("The array is: ");
		s.display(a);
		a=s.left(a);
		System.out.println("The left shifted array is: ");
		s.display(a);
	}	
}