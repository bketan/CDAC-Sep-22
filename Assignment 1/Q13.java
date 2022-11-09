import java.util.Scanner;   //reverse of a given number

class Q13{
public static void main(String []args){

   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number ");
   int a=sc.nextInt();
   
   System.out.println("Reverse of entered no. is:");
		while(a>0||a<0) 
       {
			if(a>0)
			{
			 System.out.print((a%10)); 
			a=a/10;}	
			else
			{
			 System.out.print((a%10)*-1); 
			 a=a/10;	
			}
		}				
	}
	
}	