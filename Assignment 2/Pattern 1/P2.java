class P2        
{  
	public static void main(String []args)
	{
		for(char i=65;i<=69;i++) //row
		{
			for(char j=65;j<=i;j++) //column
			{
				System.out.print(j+" "); 
			}
			System.out.println(); //to print on next line
		}
	}
}

/*output
A
A B 
A B C
A B C D
A B C D E */