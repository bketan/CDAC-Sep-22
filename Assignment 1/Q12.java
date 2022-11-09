import java.util.*;

class Q12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number = ");
		int a = sc.nextInt();
		System.out.print("Enter the second number = ");
		int b = sc.nextInt();
		
		int i;
		int sum = a;
		for ( i = 0; i < b; i++)
		{
			sum++ ;
		}
		System.out.println("Sum of " +a+ " and " +b+ " is " +sum);
	}
}