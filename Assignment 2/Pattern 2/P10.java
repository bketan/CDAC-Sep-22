class P10{   //pattern 10
public static void main(String args[]){

 for(int i=1;i<=5;i++) //rows
  {
   for (int j=5;j>i;j--)  //space
    {
	 System.out.print(" ");
	}
	 for(int j=5;j>=1;j--)  //column
	 {System.out.print("*");
	 }
	  System.out.println();
	}
}}
/* output

    *****
   *****
  *****
 *****
*****    */