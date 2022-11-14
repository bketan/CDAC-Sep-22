class P16
{ 
	public static void main(String[]args)
	{
		for(int i=5;i>=1;i--) //row
		{
			for (int j=5;j>=i;j--) //column
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/* output
   5 
   5 4
   5 4 3
   5 4 3 2
   5 4 3 2 1   */