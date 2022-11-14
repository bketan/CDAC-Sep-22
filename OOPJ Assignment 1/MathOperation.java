class Demo    //Q7
{   
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int subtract(int a,int b)
    {
		return a-b;
	}
	
	static int multiply(int a,int b)
    {
		return a*b;
	}
	
	static int power(int a,int b)
    {
		int result = 1;
		while (b != 0) 
		{
			result = a*result;
			--b;
		}
		return result;
	}
}
	
class MathOperation
{
	public static void main(String args[])
	{
		System.out.println(Demo.add(5,2));
		System.out.println(Demo.subtract(5,2));
		System.out.println(Demo.multiply(5,2));
		System.out.println(Demo.power(5,2));
	}
}