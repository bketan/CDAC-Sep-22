class P8{    //pattern 8
public static void main(String args[]){

  for (int i=1;i<=5;i++)  //rows
   {
    for (int j=1;j<=i-1;j++)  //column
	 {
	  System.out.print("*");
	 }
	
	 System.out.println();
    }


  for (int i=1;i<=5;i++)   //rows
   {
    for (int j=5;j>=i;j--)
	 {
	  System.out.print("*");   //column
	 }
	
	 System.out.println();
   }
}}
/* output
 
*
**
***
****
*****
****
***
**
*  */