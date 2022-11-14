class Q8     //running average of 3 consecutive integers.
{
	public static void main(String args[])
	{
		int a[] = {5,14,21,27,36,72}; 
		int n = a.length;
		
		int b[] = new int[n-2];
		int i = 0;
		int j = 0;
		
		while(n >= 3)
		{
			int sum = 0;
			sum = a[i] + a[++i] + a[++i];
			b[j] = sum/3;
			j++;
			i = j;
			n--;
		}
	
		if(a.length<3)
		{
			System.out.println("No Output");
		}
		else
		{
			System.out.println("Array of sum is : ");
			for(int x : b)
			{
				System.out.print(x+" ");
			}
		}
	}
}