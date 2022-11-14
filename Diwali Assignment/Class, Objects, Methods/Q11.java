class Demo     //Use of Methods in a Class
{
	int a;
	int b;
	
	Demo()
	{}
	
	Demo(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void addition()
	{
		int res = a + b;
		System.out.println("Addition of a & b is : "+res);
	}
	
	void subtraction()
	{
		int res = a - b;
		System.out.println("Subtraction of the a & b is : "+res);
	}
	
	int multiplication()
	{
		int res = a*b;
		return res;
	}
}

class Q11
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(20, 10);
		d1.addition();
		d1.subtraction();
		
		int i = d1.multiplication();
		System.out.println("Multiplication of a & b is : "+i);
	}
}