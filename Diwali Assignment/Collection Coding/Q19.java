import java.util.*;          //Tree Set Iteration

class Q19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		TreeSet<String> l1 = new TreeSet<String>();
		
		l1.add("Redmi");
		l1.add("Motorola");
		l1.add("Apple");
		l1.add("Oppo");
		l1.add("Vivo");
		l1.add("Samsung");
		l1.add("OnePlus");
		
		System.out.println("Tree Set is : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
	}
}