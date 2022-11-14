import java.util.*;        //Merging Two String

class Q11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string 1 : ");
		String s = sc.nextLine();
		int n1 = s.length();
		
		System.out.print("Enter the string 2 : ");
		String t = sc.nextLine();
		int n2 = t.length();
		
		String res = "";
		
		int i = 0;
		int j = 0;
		
		while(i < n1 && j < n2)
		{
			res = res + s.charAt(i++);
			res = res + t.charAt(j++);
		}
		
		while(i < n1)
		{
			res = res + s.charAt(i++);
		}
		
		while(j < n2)
		{
			res = res + t.charAt(j++);
		}
		System.out.println("String after merging is : "+res);
	}
}