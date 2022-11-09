import java.util.Scanner;     //to print n even numbers

class Q19{
public static void main(String args []){
      
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the input ");
	  short a = sc.nextShort();
	  
	  System.out.println("First "+a+" even nos are");
	    for (short j=1;j<=a;j++)  
		  { 
	       System.out.print(2*j+"  ");
		  }
}}