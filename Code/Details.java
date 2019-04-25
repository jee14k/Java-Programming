import java.util.*;
class Movie
{	private String title;
	private	String studio;
	private	double rating;
	
	Movie(String t, String s, double r)
	{	title = t;
		studio = s;
		rating = r;
	}

	void display()
	{	System.out.println("Title: " + title);
		System.out.println("Studio: " + studio);
		System.out.println("Rating: " + rating);
		System.out.println("");
	}
	
	double hiRating()
	{	return rating;
	}

	String hiMovie()
	{	return title;
	}		

}

class Details
{	public static void main(String[] args)	

	{	Scanner in = new Scanner(System.in);
		System.out.println("");
                System.out.println("*********************************************");
		System.out.println("Program to search for the Highest Rated Movie");
		System.out.println("*********************************************");
		System.out.println("");
		int number = Integer.parseInt(args[0]);
		int i; double hr = 0; int hi=0;
		Movie film[] = new Movie[number];
		String t,s; double r;
		
		
		for(i=0; i < number; i++)
		{
			System.out.println("Enter Title: ");
			t = in.nextLine();
			System.out.println("Enter Studio Name: ");
			s = in.nextLine();
			System.out.println("Give a Rating(Out of 5): ");
			r = in.nextDouble();
			in.nextLine();
			film[i] = new Movie(t,s,r);
			System.out.println("");
		}
		System.out.println("*********************************************");
		System.out.println("You have entered the following details: ");		

		for(i=0; i< number; i++)
		{
			film[i].display();
		}

		System.out.println("*********************************************");
		System.out.println("");

		for(i=0; i< number; i++)
		{
			if(hr<film[i].hiRating())
			{	hr = film[i].hiRating();
				hi = i;
			}
		}
		
		System.out.println("Highest Rated Movie: "+film[hi].hiMovie());
		System.out.println("Rating:  "+hr);
		System.out.println("*********************************************");
	}
}





