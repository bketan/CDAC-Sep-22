interface Shape      //Implement Shape Interface using Circle and Rectangle Class
{
   void calArea();
}

class Rectangle implements Shape
{	
	int length = 10;
	int breadth = 8;
   
  public void calArea()   //if not pubic then error
	{                      // attempting to assign weaker access privileges; was public
	   System.out.println("Area of rectangle is "+(length*breadth));
	}
}
	 
class Circle implements Shape
{
   double radius = 7;
   
   public void calArea()
   {
     System.out.println("Area of circle is "+(22/7*radius*radius));
   }
}
	 
class Q7
{
  public static void main(String args[])
  {
     Rectangle r = new Rectangle();
     Circle c = new Circle();
	 r.calArea();
	 c.calArea();
  }
}
  