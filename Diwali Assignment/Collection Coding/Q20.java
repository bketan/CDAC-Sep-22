import java.util.*;        //TreeSet Not Less Than7

class Q20
{
	public static void main(String args[])
	{
		TreeSet<Integer> l1 = new TreeSet<Integer>();
		
		l1.add(1);
		l1.add(19);
		l1.add(28);
		l1.add(33);
		l1.add(23);
		l1.add(15);
		l1.add(12);
		System.out.println("Elements in the TreeSet are : ");
		
		for(Integer x : l1)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("Elements in the TreeSet less than 7 are : ");
		
		for(Integer s : l1)
		{
			if(s < 7)
			{
				System.out.println(s);
			}
		}
	}
}