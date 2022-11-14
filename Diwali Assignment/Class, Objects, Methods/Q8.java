class Test            //Count Number of Objects Created for Class
{
	static int noOfObjects = 0;
    {
      noOfObjects += 1;
    }
  
    Test()
    {}
    
	Test(int n)
    {}
    
	Test(String s)
    {}
}

class Q8{
  
    public static void main(String args[])
    {
        Test t1 = new Test();
        Test t2 = new Test(5);
        Test t3 = new Test("Twitter");
  
       System.out.println(t1.noOfObjects);
    }
}