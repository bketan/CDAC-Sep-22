class Q5
{
    public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}


/*  O/P 
	1
   2 1 2
  3 2 1 2 3
 4 3 2 1 2 3 4	*/