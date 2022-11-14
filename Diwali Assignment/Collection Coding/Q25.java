import java.util.*;      //HashMap Mapping Specified Key

class Q25
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> l1 = new HashMap<Integer, String>();
		
		l1.put(1, "Redmi");
		l1.put(2, "Motorola");
		l1.put(3, "Apple");
		l1.put(4, "Oppo");
		l1.put(5, "Vivo");
		l1.put(6, "Samsung");
		l1.put(7, "OnePlus");
		
		System.out.println("Elements in the hashmap are : ");
	
		Set<Map.Entry<Integer, String>> s1 = l1.entrySet();
		
		for(Map.Entry<Integer, String> entry : s1)
		{
			System.out.println(entry);
		}
       
		
		System.out.println("Enter the key of the value you want to search : ");
		int n = sc.nextInt();
		
		Set<Integer> s2 = l1.keySet();
		for(Integer k : s2)
		{
			if(k.equals(n))
			{
				System.out.println("Value at given key is : "+l1.get(n));
			}
		}
	}
}