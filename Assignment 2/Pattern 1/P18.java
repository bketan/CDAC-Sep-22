class P18
{
	public static void main(String []args)
	{
		for(char i=69;i>=65;i--) //rows
		{
			for (char j=65;j<=i;j++) //column
			{
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}	
}

/* output
   A B C D E
   A B C D
   A B C
   A B
   A       */