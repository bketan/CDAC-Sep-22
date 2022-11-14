class Shape      //Use of Final Keyword
{
	final int length = 18 ;
	final int breadth = 12;  
	
	final public void printDetails()   //cant be overridden by child class
	{ 
		System.out.println("Length of the rectangle is : "+length);
		System.out.println("Breadth of the rectangle is : "+breadth);
	}
}

final class Rectangle extends Shape       // cant be inherited
{ 
	public void calArea()
	{
		int areaR = length * breadth;
		System.out.println("Area of the rectangle is : "+areaR);
	}
}

class Q16
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.printDetails();
		r1.calArea();
	}
}