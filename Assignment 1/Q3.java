import java.lang.*;
import java.util.*;

class Q3
{
	public static int rec(int i)
	{
		int f;
		if(i == 1)
		{
			return(1);
		}	
		else
		{
			f = i*rec(i-1);
			return(f);
		}
	}
	public static void main(String[] args)
	{
		int fact;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n = sc.nextInt();
		
		fact = rec(n);
		System.out.println("facorial of " + n + " is = " +fact);
	}
}