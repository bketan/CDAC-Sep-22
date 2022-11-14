import java.util.*;        //Jewels Stones

class Q10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the jewels : ");
		String k = sc.nextLine();
		
		System.out.print("Enter the stones : ");
		String s = sc.nextLine();
		
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = 0; j < k.length(); j++)
			{
				if(s.charAt(i) == k.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}