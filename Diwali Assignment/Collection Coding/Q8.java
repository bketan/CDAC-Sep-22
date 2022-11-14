import java.util.*;           // Linked List Element At End

class Q8
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
		System.out.print("Enter the element you want to add at the end : ");
		String s = sc.nextLine();
		
		l1.add(l1.size(), s);
		
		System.out.print("Linked list after appending element at the end : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
	}
}