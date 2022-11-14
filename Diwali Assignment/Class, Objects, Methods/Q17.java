class Bowlers       //Use of Constructor
{
	int wickets;
	String name;
	
	Bowlers()
	{}
	
	Bowlers(int wickets, String name)
	{
		this.wickets = wickets;
		this.name = name;
	}
	
	void printDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("No Wkts : "+wickets);
	}
}

class Spinners extends Bowlers
{
	double maxSpeed;
	Spinners()
	{}
	
	Spinners(double maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	
	void printDetails()
	{
		System.out.println("Max bowling speed : "+maxSpeed);
	}
}

class Q17
{
	public static void main(String args[])
	{
		Bowlers b1 = new Bowlers(442, "R Ashwin");
		b1.printDetails();
		Spinners c1 = new Spinners(88.3);
		c1.printDetails();
		System.out.println();
		
		Bowlers b2 = new Bowlers(417, "Harbhajan Singh");
		b2.printDetails();
		Spinners c2= new Spinners(90.5);
		c2.printDetails();
	}
}