import java.util.*;      //HashMap Empty

class Q24
{
	public static void main(String args[])
	{
		HashMap<Integer, String> l1 = new HashMap<Integer, String>();
		
		l1.put(1, "Redmi");
		l1.put(2, "Motorola");
		l1.put(3, "Apple");
		l1.put(4, "Oppo");
		l1.put(5, "Vivo");
		l1.put(6, "Samsung");
		l1.put(7, "OnePlus");
		
		if(l1.isEmpty())
		{
			System.out.println("Hash map is empty");
		}
		else
		{
			System.out.println("Hash map is not empty");
		}
	}
}