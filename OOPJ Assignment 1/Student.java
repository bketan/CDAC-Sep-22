class Student         //Q5
{    
    int s1,s2,s3;
	int sum;
	String name;
	
	void marks(int s1, int s2, int s3)
	{ 
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		sum = s1+s2+s3;
	}
	 
	double avg()
	{ 
		return sum/3;
	}
	  
	void display(String name)
	{
		System.out.println("Name "+name);
		System.out.println("Total marks "+sum);
		System.out.println("Average marks "+avg());
	}
	  
	public static void main(String args[])
	{	
		Student s = new Student();
   
		s.marks(50,76,80);
		s.avg();
		s.display("Rahul");
	}
}