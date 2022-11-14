class P9
{  
	public static void main(String[]args)
	{

		for(char i=65;i<=69;i++)  //row
		{
			for (char j=69;j>=i;j--) //space
			{
				System.out.print(" ");
			}
			for (char j=65;j<=i;j++) //row
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

 /* output
    
	 A
    A B
   A B C
  A B C D
 A B C D E */