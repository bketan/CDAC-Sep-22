import java.util.*;   //convert a byte array to String

class Q11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		int n = sc.nextInt();
		
		byte b[] = new byte[n];
		
		System.out.println("Enter the elements in the array : ");
		for(int i = 0 ; i < b.length; i++)
		{
			b[i] = sc.nextByte();
		}
		System.out.println(Arrays.toString(b));
	}
}