class P12{  //pattern 12
public static void main(String[]args){

  for(int i=1;i<=5;i++)  //row
   {
     for (int j=4;j>=i;j--) //space
	   {
	    System.out.print(" ");
	   }
	   for (int j=1;j<=i;j++) //row
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
 5 5 5 5 5     */