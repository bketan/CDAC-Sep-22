class P5
{   
	public static void main(String []args)
	{
		for (int i=1;i<=5;i++) //rows
		{
			for (int j=5;j>i;j--) //space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++) //column
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
} 

/* output
        *
	   ***
      *****
     *******
    *********   */