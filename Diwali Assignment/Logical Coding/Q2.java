class Q2
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j =9;j>=1;j--)
			{
				if(i == 5 || (i+j) == 6 || (j-i == 4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/* O/P   
*********
 *     *
  *   *
   * *
    *                     */
