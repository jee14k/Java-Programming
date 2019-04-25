import java.util.*;
class pgm62
{
	static int choic;
	public static void main(String args[])
	{
		int top=-1, size, ch, ele, choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("STACK USING AN ARRAY\nEnter the size of the array:");
		size=sc.nextInt();
		int arr[]=new int[size];

	do
	{
		System.out.print("\n1. Push\n2. Pop\n3. Display\nEnter your choice:");
		ch=sc.nextInt();
	switch (ch)
	{
		case 1:
		if(top<size-1){
		System.out.print("\nEnter the element you want to push: ");
		ele=sc.nextInt();
		arr[++top]=ele;
		}
		else
		{
		System.out.println("\nStack overflow!");
		}
		break;

		case 2:
		if (top<=-1)
			System.out.println("\nStack underflow!");
		else 
		{
			top-=1;
			System.out.println("\nElement popped.\n");
		}
		break;

		case 3:
		int i;
		if(top == -1)
		System.out.println("\nStack Empty!");
		else{
		System.out.println("\nThe stack:");
		for(i=top; i>-1; i--)
		System.out.println(arr[i]);
		}
		break;
	}

	System.out.print("\nPress 0 to exit or any other key to continue: ");
	choice=sc.nextInt();
	}while(choice!=0);

System.out.println("\nThank You.\n");
}

}