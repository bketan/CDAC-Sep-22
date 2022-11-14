import java.util.*;         //Linked List Element At End And First

class Q10
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
		System.out.print("Enter the element you want to add at the first : ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter the element you want to add at the end : ");
		String s2 = sc.nextLine();
		
		l1.add(0, s1);
		l1.add(l1.size(), s2);
		
		System.out.println("Linked list after appending elements : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
	}
}