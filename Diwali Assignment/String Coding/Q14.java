import java.util.*;       //Reverse Words In Sentence

class Q14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String s = sc.nextLine();
		
		String str[] = s.split(" ");
		for(int i = str.length-1; i >= 0; i--)
		{
			System.out.print(str[i]+" ");
		}
	}
}