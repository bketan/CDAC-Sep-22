import java.util.*;      //palindrome String

class Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
	
		String str = s.replaceAll("[^a-zA-Z]","");
		
		str = str.toLowerCase();
		
		String s1 = "";
		
		for(int i = str.length()-1; i >= 0;i--)
		{
			s1 = s1 + str.charAt(i);
		}
		
		if(str.equals(s1))
		{
			System.out.println("true");
		}
		
		else
		{
			System.out.println("false");
		}
	}
}