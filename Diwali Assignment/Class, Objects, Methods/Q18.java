class Addition      //Use of Chaining Constructor
{
	Addition()
	{
		System.out.println("Zero constructor is called");
	}
	
	Addition(int a)
	{
		this();
		System.out.println("Value of the a is : "+a);
	}
	
	Addition(int a, int b)
	{
		this(a);
		System.out.println("Addition of the a and b is : "+(a+b));
	}
	
	Addition(int a, int b, int c)
	{
		this(a,b);
		System.out.println("Addition of the a, b and c is : "+(a+b+c));
	}
}

class Q18
{
	public static void main(String args[])
	{
		Addition a1 = new Addition(10,20,30);
	}
}