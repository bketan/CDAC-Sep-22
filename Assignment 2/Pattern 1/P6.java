class P6{   //pattern 6
public static void main(String []args)
{
  for (int i=1;i<=5;i++) //rows
  {
    for (int j=4;j>=i;j--) //space
	 {
	   System.out.print("  ");
	 }
	   
	 for(int j=1;j<=i;j++) //column
	{
	   System.out.print("* ");
	 }

	  System.out.println();
	  }
  }
} 
/* output 
         *
	   * *
	 * * *
   * * * *
 * * * * *           */