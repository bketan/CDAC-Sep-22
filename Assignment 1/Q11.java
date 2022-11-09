import java.util.*;   //smallest of three nos

   class Q11{
   public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the first number ");
   int a = sc.nextInt();
   
   System.out.print("Enter the second number ");
   int b = sc.nextInt();
   
   System.out.print("Enter the third number ");
   int c = sc.nextInt();
   
     if (a<b && a<c)
	  System.out.print("Smallest number is "+a);
	  
	  else if (b<a && b<c)
	  System.out.print("Smallest number is "+b);
	  
	  else
	  System.out.print("Smallest number is "+c);
   }}