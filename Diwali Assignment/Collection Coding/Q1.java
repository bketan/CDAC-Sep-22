import java.util.*;       //ArrayList Colors

class Q1        
{           
	public static void main(String args[])
	{
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Redmi");
		l1.add("Motorola");
		l1.add("Apple");
		l1.add("Oppo");
		l1.add("Vivo");
		l1.add("Samsung");
		l1.add("OnePlus");
		
		for(String x : l1)
		{
			System.out.println(x);
		}
	}
}

