class Student    //Method without Parameters and Return Type
{
	int rollNo;
	String name;
	double marks;
	
	Student()
	{}
	
	Student(int rollNo, String name, double marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public void printDetails()
	{
		System.out.println("Roll no of the student is : "+rollNo);
		System.out.println("Name of the student is : "+name);
		System.out.println("Marks of the student is : "+marks);
	}
}

class Q13
{
	public static void main(String args[])
	{
		Student s1 = new Student(41, "Steve", 40.5);
		s1.printDetails();
	}
}