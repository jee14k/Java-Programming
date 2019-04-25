import java.io.*;
import java.util.*;
import java.lang.Exception;
class MarksError extends Exception
{
	MarksError(String message)
	{
		super(message);
	}
}
class NameError extends Exception
{
	NameError(String message)
	{
		super(message);
	}
}
class RollNumberError extends Exception
{
	RollNumberError(String message)
	{
		super(message);
	}
}
class Student 
{
	Scanner sc = new Scanner(System.in);
	String studentName;
	String className;
	int age;
	String age1;
	int regNo;
	String regNo1;
	int marks;
	Student()
	{
		studentName="";
		className="";
		age=0;
		age1="";
		regNo=0;
		regNo1="";
		marks=0;
	}
	void read()
	{
		System.out.println("What is your name?: ");
		studentName = sc.next();
		System.out.println("Which class are you in?: ");
		className = sc.next();
		try
		{
			if(!className.equalsIgnoreCase("CMS"))
			{
				throw new NameError("SORRY!! ONLY CMS STUDENTS :/");
			}
		}
		catch(NameError s)
		{
			System.out.println(s.getMessage());
			className="";
			//System.exit(0);
		}
		System.out.println("How old are you?: ");
		age1 = sc.next();
		try
		{
			age = Integer.parseInt(age1);
		}catch(NumberFormatException e)
		{
			System.out.println("SORRY!! WRONG AGE FORMAT!!");
			age=0;
			//System.exit(0);
		}
		System.out.println("What is your roll Number?: ");
		Scanner f = new Scanner(System.in);
		regNo1 = f.nextLine();
		try
		{
			regNo = Integer.parseInt(regNo1);
			throw new RollNumberError("SORRY!! WRONG ROLL NUMBER FORMAT:/");
		}catch(NumberFormatException e)
		{
			System.out.println("INVALID INPUT");
			System.out.println("Please Enter again");
			regNo=sc.nextInt();
		}
		catch(RollNumberError r)
		{
			System.out.print(r.getMessage());	
		}
		catch(InputMismatchException e)
		{
			System.out.print(e.getMessage());
		}
		System.out.println("How many marks did you get?: ");
		marks = sc.nextInt();
		try
		{
			if(marks<0 || marks>100)
			{
				throw new MarksError("Please enter marks between 0 & 100");
			}	
		}
		catch(InputMismatchException e){}
		catch(MarksError t)
		{
			System.out.println(t.getMessage());
			marks=0;
			//System.exit(0);
		}
		display(studentName,className,age,regNo,marks);
	}
	void display(String studentName,String className,int age,int regNo,int marks)
	{
		System.out.println("Your details are: ");
		System.out.println("******************************************************");
		System.out.println("ROLL NUMBER | NAME \t| AGE | CLASS | MARKS |");
		System.out.println("----------------------------------------------");
		System.out.println(regNo+"\t\t"+studentName+"\t   "+age+"\t"+className+"\t"+marks);
		System.out.println("----------------------------------------------");
	}
}
class Studentest
{
	public static void main(String[] args)throws Exception
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		do
		{
			System.out.println("**********************");	
			System.out.println("LAB PROGRAM 10");
			System.out.println("**********************");
			s.read();
			System.out.println("*************************************************");
			System.out.println("Do you want to continue?(Y/N): ");
			ch = (char)System.in.read();
		}while(ch=='Y'||ch=='y');
	}
}