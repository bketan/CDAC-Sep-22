abstract class Demo       //Use of All Features of Abstract Class
{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
class FirstChild extends Demo 
{
     void m1() 
	{
      System.out.println("Inside m1");
    }
}
 
class SecondChild extends FirstChild 
{
     void m2() 
	{
      System.out.println("Inside m2");
    }
    void m3() 
	{
      System.out.println("Inside m3");
    }
}

class Q1 {
    public static void main(String[] args)
    {
       //FirstChild f=new FirstChild();  // FirstChild is not abstract and does not override abstract method m3,m2 

       SecondChild s = new SecondChild();
        s.m1();
        s.m2();
        s.m3();
    }
}