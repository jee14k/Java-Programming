import java.util.*;
class Stud
{
	Scanner sc = new Scanner(System.in);
	String name,cl;
	void accept()
	{
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your class: ");
		cl = sc.nextLine(); 
	}
	void display()
	{
		System.out.println("The name of the student is: "+name);
		System.out.println("The name of the student's class is: "+cl);
	}
}
class Subject extends Stud
{
	String sub;
	void accept()
	{
		super.accept();																			//	calling studs accept function
		System.out.println("Enter your subject: ");
		sub = sc.nextLine();
	}
	void display()
	{
		super.display();																		//	calling studs accept function
		System.out.println("The name of the student's Subject is: "+sub);
	}
}
class Result extends Subject
{
	int rs;
	void accept()
	{
		super.accept();																			  //  calling subjects accept function
		System.out.println("Enter your marks: ");
		rs = sc.nextInt();
	}
	void display()
	{
		super.display();																		    // calling subjects display funtion
		System.out.println("The student has got "+rs+" marks");
	}	
}
class Emotion extends Result
{
	String em="";
	Emotion getObject()															// non - primitive method for returning instance
	{
		return this;                                                           // returning instance,object of current class
	}
	void cond()
	{
		if(rs>90 && rs<=100)
		{
			em = "Excited";
		}
		else if(rs>80 && rs<=90)
		{
			em = "Happy";
		}
		else if(rs>70 && rs<=80)	
		{
			em = "Alright";
		}
		else if(rs>60 && rs<=70)
		{
			em = "Okay";
		}
		else if(rs>50 && rs<=60)
		{
			em = "Sad";
		}
		else if(rs>40 && rs<=50)
		{
			em = "Disheartened";
		}
		else
		{
			em = "Depressed";
		}
	}
	void display()
	{
		this.cond();                                                                     // invoking current class method
		super.display();                                                                 // calling Result class's display function
		System.out.println("The student is: "+em);
	}
}
class Studtest
{
	public static void main(String args[])
	{
		System.out.println("----------------------------------");
		System.out.println("PROGRAM TO DEMONSTRATE INHERITANCE");
		System.out.println("----------------------------------");
		Emotion e = new Emotion();                                                         //creating object e of class emation
		e.accept();                                                                        //calling accept function of Result
		e.getObject().display();                                                           //calling class method 
	}
}