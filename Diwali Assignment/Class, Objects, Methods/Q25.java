class First        //Static Block or the Static Method
{
	static
	{
		System.out.println("Static block - 1");
	}
	
	void NonStaticMethod()
	{
		System.out.println("Non Static method");
	}
	
	{
		System.out.println("Non-Static block - 1");
	}
	
	static
	{
		System.out.println("Static block - 2");
	}
	
	static void staticMethod()
	{
		System.out.println("Static method");
	}
}

class Q25
{
	public static void main(String args[])
	{
		First f1 = new First();
		f1.NonStaticMethod();
		First.staticMethod();
	}
}