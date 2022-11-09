import java.util.*;  //to find LCM

   class Q15{
   public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the first number ");
   int a = sc.nextInt();
   
   System.out.print("Enter the second number ");
   int b = sc.nextInt();
   int gcd=1;
   int lcm;
   
   if(a==b)
   System.out.print("L.C.M = "+a);
   
	else if(a>b)
	 {
	   {
	    for (int i=1;i<=b;i++)
	     {
		  if(a%i==0&&b%i==0)
		  gcd =i;
	     } 
	   }
		else 
		{
		 for (int i=1;i<=a;i++)
		  {
		   if(a%i==0&&b%i==0)
		     gcd =i;
		  } 
		}
		  lcm = (a*b)/gcd;
	      System.out.println("L.C.M.= "+lcm);
	  }
	
		
   }}