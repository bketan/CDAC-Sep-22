import java.util.*;
class Q5
{
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of days ");
		int n = sc.nextInt();
		int y,m;
   
		y = n/365;
		n = n%365;
		m = n/30;
		n = n%30;
   
		System.out.print(y+" Year "+m+" months "+n+" days");
	}
}
   
   
   
   