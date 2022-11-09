import java.util.*;

class Q8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n = sc.nextInt();
		
		String number = Integer.toString(n);
		
		for (int i = 0 ; i < number.length(); i++)
		{
			System.out.println(number.charAt(i));
		}
	}
}