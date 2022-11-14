class P5
{ 
	public static void main(String[]args)
	{
		for(char i=65;i<=69;i++) //row, ASCII Value of A is used
		{
			for (char j=65;j<=i;j++) //column
			{  
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
} 
	
/*output
A
B B 
C C C 
D D D D 
E E E E E */