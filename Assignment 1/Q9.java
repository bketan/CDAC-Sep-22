import java.util.*;  //factors of the nos
class Q9{
  
   public static void main(String args[]){
   
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number ");
   short b= sc.nextShort();
   
   System.out.println("Factors of the number are");
   
   for(int i=1;i<=b;i++)
    {
	 if(b%i==0)
	  System.out.print(i+" ");
	}
}}