import java.util.*;

class Q2
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the radius in cm ");
		float r = sc.nextFloat();
		float a,c;
  
		a=(22/7)*r*r;
		c=2*(22/7)*r;
  
		System.out.println("Area of circle having radius "+r+" = "+a+" cm^2");
		System.out.print("Circumferrence of circle having radius "+r+" = "+c+" cm");
	}
}
  