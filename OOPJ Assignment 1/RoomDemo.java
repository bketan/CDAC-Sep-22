class Room          //Q4
{  
	double l,b,h;
	double v;
   
	void vol()
	{
		v = l*b*h;
	}
}
   
class RoomDemo extends Room
{
    RoomDemo(double h, double l, double b)
	{
		this.h=h;
		this.b=b;
		this.l=l;
	}
	 
	void display()
	{
		System.out.println("Volume of the room is : "+v);
	}
	 
	public static void main(String args[])
	{
		RoomDemo a = new RoomDemo(12,15,15);
		a.vol();
		a.display();
	} 
}