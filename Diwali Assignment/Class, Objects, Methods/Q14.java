class Cricketer      //Method with 2 Parameters and without Return Type
{
	int noOfInn;
	String Name;
	int Runs;
	double avg;
	
	Cricketer()
	{}
	
	public void printDetails(String Name,int noOfInn,int Runs,double avg)
	{
		System.out.println("name no of the cricketer is : "+Name);
		System.out.println("Name of the cricketer is : "+noOfInn);
		System.out.println("No of matches played by cricketer is : "+Runs);
		System.out.println("Average of the cricketer is : "+avg);
	}
}

class Q14
{
	public static void main(String args[])
	{
		Cricketer c1 = new Cricketer();
		c1.printDetails("MS Dhoni",290,10386,56.70);
	}
}