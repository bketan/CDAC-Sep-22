class Q12
{
	public static void main(String args[])
	{
		for(char i=65;i<=70;i++)
		{
			for(char j=70;j>i;j--)
			{
				System.out.print(" ");
			}
			for(char j=65;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/* O/P 
	 A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F   */