import java.util.*;     //sort an Array

class Q13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int temp;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] < a[j])         //descending order
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				/*if(a[i] > a[j])        //Ascending order
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}*/
			}
		}
		
		System.out.print("Elements after sorting are : ");
		for(int x : a)
		{
			System.out.print(x+" ");
		}
	}
}