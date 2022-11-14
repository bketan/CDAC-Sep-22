abstract class First     //Use of Abstract Class and Method
{
    First()          // class First is need to be abstract as it has one abstract method
    {
       System.out.println("First Constructor Called");
    }
	void fun()
    {
        System.out.println("Fun() is called");
    }
	final void Ffun()
    {
        System.out.println("final Ffun() called");
    }
	static void demofun()
    {
		System.out.println("demofun() is called");
    }
	
	abstract void Myfun();
}
 
class Derived extends First 
{
    Derived()
    {
        System.out.println("Derived Constructor Called");
    }
	void Myfun()
    {
        System.out.println("Anotherfun() called");
    }
}
 
class Q2 
{
	public static void main(String args[])
    {
		//First b = new First();    //error
		First b = new Derived();
        b.Myfun();
		System.out.println();
		 
        Derived d = new Derived();
        d.Myfun();
		System.out.println();
		
		d.fun();
		b.Ffun();
		Derived.demofun(); 
    }
}



 







 

   