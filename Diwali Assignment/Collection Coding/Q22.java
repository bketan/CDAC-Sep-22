import java.util.*;     //HashMap Count Of Key Value Pair

class Q22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1, "Porsche");
		m1.put(2, "Honda");
		m1.put(3, "Enfield");
		m1.put(4, "Ford");
		m1.put(5, "Toyota");
		m1.put(6, "Nissan");
		
		System.out.println("Elements in the hashmap are : ");
		int count = 0;
		
		Set<Map.Entry<Integer, String>> s1 = m1.entrySet();
		
		for(Map.Entry<Integer, String> entry : s1)
		{
			System.out.println(entry);
			count++;
		}
		System.out.println("Total key-value pairs in the hashmap are : "+count);
	}
}