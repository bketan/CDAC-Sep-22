import java.util.Scanner;   //sum of digits of no

class Q10{
public static void main(String []args){

   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number ");
   int a=sc.nextInt();
   int sum =0;
   int d;
   
    if (a==0)		
        System.out.println("Enter Positive No. and try again... ");
   
     while(a!=0)
     {
	  d=a%10;				
	  sum=sum+d;
	  a=a/10;
	 }
      System.out.println("The Sum of Digits is: "+sum);

}}
	 
	  		  
		
           
		
	
	

		
		
	
	
