class Box        //Q6
{     
	double l,b,h;
	double sa;
	double vol;
	
	Box(double l, double b, double h)
	{
		this.h=h;
		this.b=b;
		this.l=l;
	}
	
	double getVolume()
	{
		return l*b*h;
	}
	
	double getArea()
	{
		return (2*(l*l+b*b+h*h));
	}
	
	void display()
	{
		System.out.println("Volume is "+getVolume());
		System.out.println("Area is "+getArea());
	}
	
	public static void main(String args[])
	{
		Box b1 = new Box(5,7,8);
		System.out.println("For box 1");
		b1.display();
  
		Box b2 = new Box(4,6,3);
		System.out.println("For box 2");
		b2.display();
	}
}
  