import java.util.*;     //String To Int

class Q9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();

		int num = Integer.parseInt(s);
		System.out.println("Integer conversion of given string is : "+num);
		
		s = s + 12;
		num = num + 12;
		
		System.out.println("s = s + 12 : "+s);
		System.out.println("num = num + 12 : "+num);
	}
}