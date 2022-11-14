import java.util.*;      //Linked List Elements And Position

class Q11
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
		
		System.out.println("Elements in the linked list are : ");
		for(int i = 0; i < l1.size(); i++)
		{
			System.out.println(l1.get(i)+" : "+i);
		}
	}
}