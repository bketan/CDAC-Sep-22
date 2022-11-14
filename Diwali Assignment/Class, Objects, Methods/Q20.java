class Employee     //String Constructor
{
	String name;
	Employee()
	{}
	
	Employee(String name)
	{
		this.name = name;
	}
	
	void printDetails()
	{
		System.out.println("Given string is : "+name);
	}
}

class Q20
{
	public static void main(String args[])
	{
		Employee e1 = new Employee("Virat Kohli");
		e1.printDetails();
	}
}