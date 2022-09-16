class P6{   //pattern 6
public static void main(String []args)
{
 for(int i=1;i<=5;i++) //row
  {
   for(int j=1;j<i;j++)  //space
    {System.out.print(" ");
	}
	 for (int j=9;j>=(i*2)-1;j--) //column
	  {
	   System.out.print("*");
	  }
	  System.out.println();
	}
}}

/* output

*********
 *******
  *****
   ***
    *     */