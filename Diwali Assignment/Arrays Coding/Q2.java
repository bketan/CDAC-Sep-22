class Q2   //to check the equality of two arrays
{
	public static void main(String args[])
	{
		int a[] = {1,3,4,5,6};
		int b[] = {1,3,4,5,6};
		//int b[] = {2,3,4,7,8};
		int c[] = new int[5];
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < b.length; j++)
			{
				if(a[i] == b[j])
				{
					c[i] = 1;
				}
			}
		}
		
		int count = 0;
		for(int i = 0; i < c.length; i++)
		{
			if(c[i] == 1)
			{
				count++;
			}
		}
		
		if(count == 5)
		{
			System.out.println("Both arrays are equal.");
		}
		else
		{
			System.out.println("Both arrays are not equal.");
		}
	}
}