class HC         //Use of HashCode() Method
{
	int a;
	int b;
	
	HC()
	{}
	
	HC(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public String toString()
	{
		return "[ a = "+a+", b = "+b+" ]";
	}
	
	public int hashCode()
	{
		return 5*(a+b);
	}
	
	public boolean equals(Object ob)
	{
		HC d = (HC)ob;
		if(this.a == d.a && this.b == d.b)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}

class Q15
{
	public static void main(String args[])
	{
		HC d1 = new HC(5, 7);
		HC d2 = new HC(9, 11);
		
		System.out.println("d1 = "+d1);
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
		
		System.out.println("d2 = "+d2);
		System.out.println("Hash code of the d2 is : "+d2.hashCode());
		
		System.out.println(d1.equals(d2));
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
	}
}

/*  wihtout overriding hashcode method
d1 =  Database [ a = 5, b = 7 ]
Hash code of the d1 is : 366712642
d1 =  Database [ a = 5, b = 7 ]
Hash code of the d2 is : 1829164700
*/


/* after overriding hashCode method
d1 =  Database [ a = 5, b = 7 ]
Hash code of the d1 is : 60
d1 =  Database [ a = 5, b = 7 ]
Hash code of the d2 is : 60
true
Hash code of the d1 is : 60
Hash code of the d1 is : 60
*/