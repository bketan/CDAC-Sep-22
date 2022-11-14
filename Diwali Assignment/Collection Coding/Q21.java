import java.util.*;     //Priority Queue Remove All Elements

class Q21
{
	public static void main(String args[])
	{
		PriorityQueue<String> l1 = new PriorityQueue<String>();
		
		l1.add("Redmi");
		l1.add("Motorola");
		l1.add("Apple");
		l1.add("Oppo");
		l1.add("Vivo");
		l1.add("Samsung");
		l1.add("OnePlus");
		
		System.out.println("Elements in the priority queue are : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
		l1.clear();
		System.out.println();
		
		System.out.println("Priority queue after removing all elements : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
	}
}