import java.util.*;    //sum all the values of a given Array

class Q19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum of the elements of the array is : "+sum);
	}
}