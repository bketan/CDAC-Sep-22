import java.util.Scanner;  //LCM by prime factor method

class Q16{
public static void main(String args[]){

  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the first number ");
  int a =sc.nextInt();
  
  System.out.print("Enter the second number ");
  int b =sc.nextInt();
  int lcm =1;
  
  if(a==b)
   System.out.print("L.C.M = "+a);

   else
   {
	 for(int i=2;i<a||i<b;i++)  
		{
		 while(a%i==0&&b%i==0)    
			{
			 lcm=lcm*i;
			 a=a/i;
			 b=b/i;	
			}
		}
		  System.out.println("LCM "+lcm);
	}
}}
		
  
  
   