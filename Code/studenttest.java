class student
{
	int rollno;
	String name,course;
	float fee;
	student(int rollno, String name, String course)
	{
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	student(int rollno,String name,String course,float fee)
	{
		this(rollno,name,course);
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+""+name+""+course+""+fee);
	}
}
class studenttest
{
	public static void main(String args[])
	{
		student s1 = new student(11," Don "," Java ");
		student s2 = new student(12," Sumit "," Java ",5000);
		s1.display();
		s2.display();
	}
}