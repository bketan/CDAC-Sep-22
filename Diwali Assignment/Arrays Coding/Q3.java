import java.util.Arrays;     //to find all pairs of elements in an integer array whose sum is equal to a given number
import java.util.Scanner;
class Q3 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array that is to be created: ");
		int n = sc.nextInt();
		int[] myArray = new int[n];
	  
		System.out.print("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
		{
			myArray[i] = sc.nextInt();
		}
	  
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
	  
		System.out.println("The array created is: "+Arrays.toString(myArray));
		System.out.println("indices of the elements whose sum is: "+num);
	  
		for(int i=0; i<myArray.length; i++)
		{
			for (int j=i; j<myArray.length; j++)
			{
				if((myArray[i]+myArray[j])== num && i!=j)
				{
				System.out.println(i+", "+j);
				}
			}
		}
    }
}

