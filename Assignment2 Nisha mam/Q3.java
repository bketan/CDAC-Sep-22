import java.util.*;
class Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks in English = ");
		int s1 = sc.nextInt();

		System.out.print("Enter the marks in Maths = ");
		int s2 = sc.nextInt();

		System.out.print("Enter the marks in Science = ");
		int s3 = sc.nextInt();

		System.out.print("Enter the marks in History = ");
		int s4 = sc.nextInt();

		System.out.print("Enter the marks in Economics = ");
		int s5 = sc.nextInt();

		System.out.print("Enter the total marks of exam = ");
		int t = sc.nextInt();

		int sum = s1+s2+s3+s4+s5;
		float percentage = (sum/t)*100;
  
		System.out.println("Percentage marks = "+percentage+" %");
	}
}