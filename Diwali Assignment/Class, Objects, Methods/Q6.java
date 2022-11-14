class BankAcct    //Create Outer Class Bank Account and the Inner Class Interest
{
    int principal = 200;
	float rate = 4.8f; 
	float time = 2.5f;
	
    void test() 
    {
        Interest inner_obj = new Interest();
        inner_obj.display();
    }
    class Interest 
    {
        void display() 
        {
            float si = (principal * rate * time) / 100;
            System.out.println("Interest : " + si + " Rs");
        }
    }
}
public class Q6 
{
    public static void main(String args[]) 
    {
        BankAcct outer_obj = new BankAcct();
		outer_obj.test();
    }
}

