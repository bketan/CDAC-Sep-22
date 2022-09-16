class P13{  //pattern 13
public static void main(String[]args){

  for(char i=65;i<=69;i++)  //row
   {
     for (char j=69;j>=i;j--) //space
	   {
	    System.out.print(" ");
	   }
	   for (char j=65;j<=i;j++) //row
	    {
		 System.out.print(i+" ");
		}
		 System.out.println();
		
	}
}}

/* output
       A
      B B
     C C C
    D D D D
   E E E E E   */