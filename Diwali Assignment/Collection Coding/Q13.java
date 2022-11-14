import java.util.*;      //LinkedList Comparison

class Q13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Redmi");
		l1.add("Motorola");
		l1.add("Apple");
		l1.add("Oppo");
		l1.add("Vivo");
		l1.add("Samsung");
		l1.add("OnePlus");
		
		System.out.println("linked list 1 is : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		LinkedList<String> l2 = new LinkedList<String>();
		
		l2.add("Red");
		l2.add("Blue");
		l2.add("Black");
		l2.add("Brown");
		l2.add("Yellow");
		l2.add("Orange");
		
		System.out.println("linked list 2 is : ");
		for(String x : l2)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		if(l1.containsAll(l2))
		{
			System.out.println("Both the linked lists are equal");
		}
		
		else
		{
			System.out.println("Linked lists are not equal");
		}
	}
}