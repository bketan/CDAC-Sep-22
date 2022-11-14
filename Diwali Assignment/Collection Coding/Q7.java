import java.util.*;       //ArrayList Printing Elements

class Q7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Surya Kumar Yadav");
		l1.add("Mohammad Rizwan");
		l1.add("Babar Azam");
		l1.add("Devon Conway");
		l1.add("Aiden Markram");
		
		System.out.println("Elements in the array list is : ");
		for(int i = 0; i < l1.size(); i++)
		{
			System.out.println("Rank "+(i+1)+" "+l1.get(i)+" ");
		}
	}
}