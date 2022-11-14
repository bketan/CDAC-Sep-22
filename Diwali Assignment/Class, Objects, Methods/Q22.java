class Batsman      //Accessibility of Static and Non-Static Variable by a Static Method
{
	static int jersyNo;
	static String name;
	int noOfMatches;
	double avg;
	
	Batsman()
	{}
	
	Batsman(int jersyNo, String name, int noOfMatches, double avg)
	{
		this.jersyNo = jersyNo;
		this.name = name;
		this.noOfMatches = noOfMatches;
		this.avg = avg;
	}
	
	public static void printDetails()
	{
		System.out.println("Jersy no: "+jersyNo);
		System.out.println("Name: "+name);
		//System.out.println("Average: "+avg);  //non-static variable avg cannot be referenced 
	}	                                       //from a static context
	
	public void printDetails1()
	{
		System.out.println("Jersy no: "+jersyNo);  //Non static method can access both
		System.out.println("Name: "+name);         //static and non-static variable
		System.out.println("No of the matches: "+noOfMatches);
		System.out.println("Average: "+avg);
	}
}

class Q22
{
	public static void main(String args[])
	{
		Batsman b1 = new Batsman(10,"Sachin",463,44.48);
		b1.printDetails();
		b1.printDetails1();
	}
}