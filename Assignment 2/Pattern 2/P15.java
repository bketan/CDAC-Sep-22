class P15
{  
	public static void main(String args[])
	{
		for (int i = 1; i<=2; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
			for (int i = 2; i<=3; i++)
			{
				for(int j = 2; j<=3; j++)
				{
					System.out.print("*");
						for(int k = 0; k<i-1; k++)
						{
							System.out.print(" ");
						}
				}
				System.out.println();
			}
			
		for(int j = 1; j<=5; j++)
		{
			System.out.print("*");
		}
		
	}
}

/* output

*
**
* *
*  *
*****     */