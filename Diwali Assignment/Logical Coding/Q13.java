import java.util.Scanner;
public class Q13
{ 
    public static void main(String[] args) 
   	{
        char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z' };
        int letter_number = 0;
	
		String[] diamond = new String[26]; // array of strings
		System.out.print("Enter a Character between A to Z : ");
 
		Scanner sc = new Scanner(System.in);
		
		try 
		{
			char user_letter = sc.next("[A-Z]").charAt(0);     // search for letter number in the array letter
        
			for (int i = 0; i < letter.length; i++) 
			{
				if (letter[i] == user_letter) 
				{
					letter_number = i;
					break;
				}
			}
 
			for (int i = 0; i <= letter_number; i++)      // construct diamond
			{
				diamond[i] = "";                  // add initial spaces
            
				for (int j = 0; j < letter_number - i; j++) 
				{
					diamond[i] += " ";
				}
 
					diamond[i] += letter[i];           // add letter
 
				if (letter[i] != 'A')           // add space between letters
				{             
					for (int j = 0; j < 2 * i - 1; j++) 
					{ 
						diamond[i] += " ";        // add letter
					} 
					diamond[i] += letter[i]; 
				} 
				System.out.println(diamond[i]);      // Draw the first part of the diamond 
			} 
                
			for (int i = letter_number - 1; i >= 0; i--)
            {
				System.out.println(diamond[i]);	// Draw the second part of the diamond
			}									// Writing the diamondArray in reverse order
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			reader.close();
		}
	}
}