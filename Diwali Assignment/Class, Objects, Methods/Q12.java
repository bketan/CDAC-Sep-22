class Operations        //Method without Parameters and with Return Type
{
	int a;
	int b;
	String name;
	
	Operations()
	{}
	
	Operations(int a,int b,String name)
	{
		this.a = a;
		this.b = b;
		this.name = name;
	}
	
	int addition()
	{
		int res = a + b;
		return res;
	}
	
	int subtraction()
	{
		int res = a - b;
		return res;
	}
	
	double multiplication()
	{
		double res = a * b;
		return res;
	}
	
	double division()
	{
		double res = (double)a / b;
		return res;
	}
	
	String printName()
	{
		return name;
	}
}

class Q12
{
	public static void main(String args[])
	{
		Operations o1 = new Operations(7,5,"Meta");
		
		int x = o1.addition();
		int x1 = o1.subtraction();
		double y = o1.multiplication();
		double y1 = o1.division();
		String z = o1.printName();
		
		System.out.println("Addition of two no is : "+x);
		System.out.println("Subtraction of two no is : "+x1);
		System.out.println("Multiplication of two no is : "+y);
		System.out.println("Division of two no is : "+y1);
		System.out.println("Name is : "+z);
	}
}