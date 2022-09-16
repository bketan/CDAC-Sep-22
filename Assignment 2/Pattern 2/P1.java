class P1{    //pattern 1
public static void main(String args[]){

  for (int i=1;i<=5;i++)  //rows
   {
    for (int j=1;j<=i;j++)  //column
	 {
	  System.out.print("*");
	 }
	
	 System.out.println();
    }
}}

/* output
    * 
	**
	***
	****
	*****        */