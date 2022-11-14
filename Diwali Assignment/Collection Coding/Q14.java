import java.util.*;      //Linked List Replace Element

class Q14
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
		
		System.out.print("Enter the element you want to add : ");
		String s = sc.nextLine();
		
		System.out.print("Enter the position where you want to add element : ");
		int n = sc.nextInt();
		
		l1.remove(n);
		l1.add(n, s);
		
		System.out.println("Changed linked list is : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
	}
}
