class Outer  //Use of Referencing the Object from Inner Class
{
    void outerMethod()
    {
	  System.out.println("inside outerMethod");
 
     class Inner 
	 {
	  void innerMethod()
      {
	    System.out.println("inside innerMethod");
      }
     }
        Inner y = new Inner();
        y.innerMethod();
    }
}
 
class Q5 
{
  public static void main(String[] args)
    {
		Outer x = new Outer();
		x.outerMethod();
    }
}