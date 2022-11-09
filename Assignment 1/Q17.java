import java.util.Scanner;   //to check  for a palindrome number

class Q17{
public static void main(String []args){

   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number ");
   int n=sc.nextInt();
   int sum =0;
   int temp=n,r;
   
     while(n>0) 
       {
	     r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
	   }	
	     if(temp==sum)
		  System.out.print("It is a palindrome number");
			
			else
			 System.out.print("It is a not palindrome number");
 }				
}
	
