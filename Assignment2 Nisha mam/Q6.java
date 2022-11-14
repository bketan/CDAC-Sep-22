import java.util.*;
class Q6
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temp. in Fahrenheit ");
		float f = sc.nextFloat();
		float c;
   
		c= 5*(f-32)/9; 
   
		System.out.printf("Temp. in Celsius = "+c);
	}
}