import java.util.Scanner;   //to find even or odd

class Q1{
public static void main (String args[]){
Scanner sc = new Scanner (System.in);
System.out.print("Enter the number ");
    int i = sc.nextInt();
	
	if (i == 0)
	   System.out.println("Number is Zero");
	 
     else if(i % 2 == 0)
       System.out.println("Number is Even");
       
      else
        System.out.println("Number is Odd");
       
}
}	  
		  
	 



