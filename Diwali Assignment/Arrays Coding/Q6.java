class Q6    //third-largest number in an array without sorting it
{
	public static void main(String args[])
	{
		int a[] = new int[7];
		 a[0] = 24;
		 a[1] = 54;
		 a[2] = 31;
		 a[3] = 16;
		 a[4] = 82;
		 a[5] = 45;
		 a[6] = 67;
		
		int firstMax = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > firstMax)
			{
				firstMax = a[i];
			}
		}
		
		int secondMax = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] != firstMax)
			{
				if(a[i] > secondMax)
				{
					secondMax = a[i];
				}
			}
		}
		
		int thirdMax = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] != secondMax && a[i] != firstMax)
			{
				if(a[i] > thirdMax)
				{
					thirdMax = a[i];
				}
			}
		}
		System.out.println("Third largest element in the array is : "+thirdMax);
	}
}