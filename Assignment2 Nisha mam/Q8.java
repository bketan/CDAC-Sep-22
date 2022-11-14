import java.util.*;
class Q8
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Basic salary ");
		int BS = sc.nextInt();
		float HRA,DA;
   
		if(BS<10000)
		{
			HRA = 0.1f*BS;
			DA  = 0.9f*BS;
		}
		else
		{
			HRA = 2000;
			DA = 0.98f*BS;
		}
	    
		float GS = BS+DA+HRA;
		System.out.print("Gross salary = "+GS);
	}
}