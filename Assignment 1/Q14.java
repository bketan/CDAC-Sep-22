import java.util.*;  //to find GCD

   class Q14{
   public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the first number ");
   int a = sc.nextInt();
   
   System.out.print("Enter the second number ");
   int b = sc.nextInt();
   int gcd=0;
   
   if(a==b)
	System.out.print("G.C.D.= "+a);
					
    else if(a>b)
     {
	  for (int i=1;i<=b;i++)
	    {
		 if(a%i==0&&b%i==0)
		 gcd =i;
	    } 
		 System.out.println("G.C.D.= "+gcd);
	 }
		else 
		{
		 for (int i=1;i<=a;i++)
		  {
		   if(a%i==0&&b%i==0)
		     gcd =i;
		  } 
		  System.out.println("G.C.D.= "+gcd);
		}
}}