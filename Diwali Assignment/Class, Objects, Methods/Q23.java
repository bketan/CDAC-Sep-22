class Test   //Usage of an Instance Variable
{
	int a;
	int b;
	int c;
	
	Test()
	{}
	
	Test(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void printValues()
	{
		System.out.println("Value of the a is : "+a);
		System.out.println("Value of the b is : "+b);
		System.out.println("Value of the c is : "+c);
	}
}

class Q23
{
	public static void main(String args[])
	{
		Test t1 = new Test(10,20,30);
		t1.printValues();
	}
}