import java.util.*;        //Array List Sorting

class Q4
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
		
		System.out.println("Original array list is : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
		
		Collections.sort(l1);
		System.out.println();
		System.out.println("Array list after sorting  : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
	}
}