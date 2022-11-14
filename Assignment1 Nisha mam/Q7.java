import java.util.*;

class Q7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the percentage marks ");
		float p = sc.nextFloat();
  
		if ( p>=75 && p<=100)
			System.out.println("Congrats, You get Distinction");
		else if ( p>=60 && p<75)
			System.out.println("Congrats, You get First class");
		else if ( p>=40 && p<60)
			System.out.println("Congrats, You get Second class");
		else if ( p<40 && p>=0)
			System.out.println("Sorry, You have failed");
		else 
			System.out.println("Invalid input");
	}
}
		