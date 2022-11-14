import java.util.*;

class Complex
{
	int real;
	int imaginary;
	int number;
	
	Complex()
	{
		real = 0;
		imaginary = 0;
		System.out.println("Given complex number is : "+real+" + "+imaginary+"i");
	}
	
	Complex(int real)
	{
		this.real = real;
		imaginary = 0;
		System.out.println("Given complex number is : "+real+" + "+imaginary+"i");
	}
	
	Complex(int real, int imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
		System.out.println("Given complex number is : "+real+" + ("+imaginary+")i");
	}
	
	public static Complex addition()
	{
		Complex res = new Complex();
		res.real = c4.real + c4.real;
		res.imaginary = c4.imaginary + c4.imaginary;
		
		return res;
	}
	
	public static Complex multiply()
	{
		Complex res1 = new Complex();
		res1.real = c4.real * c4.real;
		res1.imaginary = c4.imaginary * c4.imaginary;
		
		return res1;
	}
}

class ComplexNumber
{
	public static void main(String args[])
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex(3);
		Complex c3 = new Complex(3, +2);
		Complex c4 = new Complex(4, -2);
		Complex multiply
	}
}