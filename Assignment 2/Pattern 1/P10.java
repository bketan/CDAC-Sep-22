class P10
{  
	public static void main(String[]args)
	{
   
		for(int i=5;i>=0;i--)  //row
		{
			int a=65;
			for (int j=1;j<=i;j++) //space
			{
				System.out.print(" ");
			}
			for (int j=i;j<=4;j++) //row
			{
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}
	}
}

/*output
         E
        D E
       C D E
      B C D E
     A B C D E     */