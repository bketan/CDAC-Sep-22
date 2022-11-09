import java.util.Scanner;     //to print n odd numbers

class Q20{
public static void main(String args []){
	
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the input ");
	  short a = sc.nextShort();
	  
	  System.out.println("First "+a+" odd nos are");
	    for (short j=0;j<a;j++)  
		  { 
	       System.out.print((2*j+1)+"  ");
		  }
}}