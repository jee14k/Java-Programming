import java.util.*;
class movie
{ 
	String title,studio;
	int rating;
	movie(String t,String s,int r)
	{
		title=t;
		studio=s;
		rating=r;
	}
	movie()
	{
		title="";
		studio="";
		rating=0;
	}
	void read1()throws NumberFormatException
	{
		Scanner sc=new Scanner (System.in);
		Scanner br=new Scanner (System.in);
		System.out.println("Enter the name of the movie");
		title=br.nextLine();
		System.out.println("Enter its studio's name");
		studio=sc.nextLine();
		System.out.println("Enter the rating of the movie");
		rating =sc.nextInt();
	}
	void display(int no,movie m1[])
	{
		int h=rating;
		int x=0;
		for(int i=1;i<no;i++)
		{
           	if(m1[i].rating>h)
			{
				h=m1[i].rating;
				x=i;
			}
		}	 
		System.out.println("The highest rated movie is "+ m1[x].title+ " from "+ m1[x].studio + " studio."); 
	}
	public static void main(String args[])throws NumberFormatException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of movies");
		int n;
		movie m[]=new movie[n];
		for(int i=0;i<n;i++)
		{  	
			m[i]=new movie();
			m[i].read1();
		}
		m[0].display(n,m);
	}
}