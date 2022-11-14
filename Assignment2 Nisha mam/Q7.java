import java.util.*;
class Q7
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number a = ");
		short a = sc.nextShort();
   
		System.out.print("Enter the Second number b = ");
		short b = sc.nextShort();
   
		a = (short)(a+b);
		b = (short)(a-b);
		a = (short)(a-b);
   
		System.out.println("After swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}