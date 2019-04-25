import java.util.*;
class moviet
{
	Scanner sc = new Scanner(System.in);
	String title,studio;
	int rating;
	moviet(String t,String s,int r)
	{
		title=t;
		studio=s;
		rating=r;
	}
	moviet()
	{
		title="";
		studio="";
		rating=0;
	}
	void read()
	{
		System.out.println("Enter the title of the movie: ");
		title=sc.next();
		System.out.println("Enter the name of the studio: ");
		studio=sc.next();
		System.out.println("Enter the rating: ");
		rating=sc.nextInt();
	}
	void display(int no,moviet m1[])
	{
		int h=rating;
		int x=0;
		for(int j=1;j<no;j++)
		{
			if(m1[j].rating>h)
			{
				h=m1[j].rating;
				x=j;
			}
		}
		System.out.println("The highest rated movie is: "+m1[x].title+" from the studio: "+m1[x].studio);
	}
}
class dis
{
	void show(int p,String t)
	{
		for(int z=0;z<p;z++)
		{
			System.out.println(t+" ");
		}
	}
}
class movietest
{
	public static void main(String args[]) throws NumberFormatException
	{
		String text;
		int n=Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		Scanner sc=new Scanner(System.in);
		moviet a[] = new moviet[n];
		dis d = new dis();
		for(int i=0;i<n;i++)
		{
			a[i]=new moviet();
			a[i].read();
		}
		a[0].display(n,a);
		System.out.println("Enter the text: ");
		text = sc.nextLine();
		d.show(m,text);
	}
}