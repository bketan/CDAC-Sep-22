class Q4   //Use of Static Inner Class
{
  static String msg = "Pune";
  static class Inner 
  {
   void display()       //this method can not be static as in nested inner class can't have sttic method
    {
      System.out.println("Welcome to " + msg);
    }
  }
  
public static void main(String[] args)
    {
      Q4.Inner inn = new Q4.Inner();
	  inn.display();
    }
}