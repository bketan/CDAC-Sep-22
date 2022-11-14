import java.util.*;          //Linked List Element Search

class Q12
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
		
		System.out.println("Original linked list is : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.print("Enter the element you want to search : ");
		String s = sc.nextLine();
		
		if(l1.contains(s))
		{
			System.out.println("Element found in the linked list");
		}
		else
		{
			System.out.println("Element does not found in the linked list");
		}
	}
}