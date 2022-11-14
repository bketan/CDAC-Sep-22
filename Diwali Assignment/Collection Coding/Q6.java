import java.util.*;            //swap two elements in an array list

class Q6
{
	public static void main(String args[])
	{
		List<Integer> list1 = new LinkedList<>();
			
		list1.add(1080);
		list1.add(2);
		list1.add(8);
		list1.add(64);
		list1.add(1);
	
		Collections.sort(list1);
		System.out.println(list1);
		
		Collections.swap(list1, 0,2);
		System.out.println(list1);
		
		Collections.swap(list1, 2,3);
		System.out.println(list1);
	}
}