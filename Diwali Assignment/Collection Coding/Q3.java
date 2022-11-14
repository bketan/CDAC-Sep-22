import java.util.*;    //ArrayList Retrive Element

class Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
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
		
		System.out.println();
		System.out.print("Enter the index of the element you want to retrive : ");
		int s = sc.nextInt();
		System.out.println("Element you want is : "+l1.get(s));
	}
}