import java.util.*;
class Q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Priciple amount = ");
		int p = sc.nextInt();
	  
		System.out.print("Enter the rate of interest = ");
		float r = sc.nextFloat();
	  
		System.out.print("Enter the time of investment in years = ");
		float n = sc.nextFloat();
		float SI;
	  
		SI = p*n*r/100;
	  
		System.out.println("Simple Interest = "+SI);
	}
}