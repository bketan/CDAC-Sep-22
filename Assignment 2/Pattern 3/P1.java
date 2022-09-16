class P1{
public static void main(String args[]){

   for (int i=1;i<=9;i++)  //row
    {
	 for (int j=8;j>=i;j--)  //space
	  {
	   System.out.print(" ");
	  }
	   for (int j=1;j<=i;j++)  //column
	   {
	    System.out.print(i+" ");
	   }
	    System.out.println();
	 }
}}

/* output
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9   */