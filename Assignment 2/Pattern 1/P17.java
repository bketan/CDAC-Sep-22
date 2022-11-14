class  P17
{  
	public static void main(String args[])
	{
		int c=1;
		for (int i=1;i<=5;i++) //row
		{
			for (int j=1;j<=i;j++) // column
			{ 
				System.out.print(c+" ");
				c++;                    // if we increse c after for loop it will print same value in one row
			}
			System.out.println();
		}
	}
}

 /*output
      1
      2 3
      4 5 6
      7 8 9 10
      11 12 13 14 15   */