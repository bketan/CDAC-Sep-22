class Q24
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{ 
			int a=0,b=4;
			for(int j=1;j<=i;j++)
			{ 
				int c=i+a;
				System.out.print(c+" ");
				a=a+b;
				b--;
			}
			System.out.println();
		}
	}
}

/* O/P 
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15  */