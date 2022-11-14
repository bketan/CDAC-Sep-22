class P3
{     
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)   //rows
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("*");   //column
			}
			System.out.println();
		}
	}
}

/* output
    *****
	****
	***
	**
	*        */
