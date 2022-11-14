import java.util.*;       //Remove Given Character

class Q20
{
	public static void removeCharacter(String word, char c)
	{
		int x = word.indexOf(c);
		
		StringBuffer str = new StringBuffer(word);
		str.delete(x, x+1);
		System.out.println("String after deletion of given character is : "+str);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.print("Enter the character you want to remove : ");
		char ch = sc.next().charAt(0);
		
		removeCharacter(s, ch);
	}
}