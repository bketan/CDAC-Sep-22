import java.util.*;     //HashSet Iteration

class Q15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet<String> l1 = new HashSet<String>();
		
		l1.add("Redmi");
		l1.add("Motorola");
		l1.add("Apple");
		l1.add("Oppo");
		l1.add("Vivo");
		l1.add("Samsung");
		l1.add("OnePlus");
		
		System.out.println("Hash Set is : ");
		for(String x : l1)
		{
			System.out.print(x+" ");
		}
	}
}