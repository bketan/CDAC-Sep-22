import java.util.Scanner;  //Factorial

class Q2{
public static void main(String args[]){

  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number ");
  int n =sc.nextInt();

   int fact=1;
    if (n==0)
      System.out.print("Factorial of the number is 1");
	 
	else{
	    /*while(n!=0)  //using while loop
		{
		  fact=fact*n;
		  n--;
		}
		  System.out.print("Factorial of the number is "+fact);
		} */
		
		for(int i =n;i>0;i--)   //using for loop
		  fact=fact*i;
		  System.out.print("Factorial of the number is "+fact);
        }
			
		
   
}}