class P4{
public static void main(String args[]){

  for(int i=1;i<=9;i++)    //row
   {
   for(int j=9;j>i;j--)   //space
	 {
	  System.out.print("  "); 
	 }
	  for(int j=1;j<=i;j++)  //column
	  {
	   System.out.print(j+" ");
	  }
       
       for(int j=i;j>1;j--)   //column
	   {
		 System.out.print(j-1+" ");
	   }   
	     System.out.println();
	  }  
	}
}

/* output

                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1    */