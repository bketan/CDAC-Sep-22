import java.util.*;
import java.io.*; 
class Book
{
	String title;
	String author ;//[] = new String[5];
	int pages;
	float price;
	String publisher;
	static Book b [] = new Book[5];
	
	static int a;
	int n;
	
	Book() 
	{}
	
	Book(String Title,String Author,int Pages,float Price,String Publisher)
	{
		this.title = Title ;
		this.author = Author;
		this.pages = Pages;
		this.price = Price;
		this.publisher = Publisher;
	}
	
	void add(int k)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<k; i++)
		{
			System.out.print("Enter the Book Name ");
			this.title = sc.next();
			
			System.out.print("Enter Author name ");
			this.author = sc.next();
			
			System.out.print("Enter pages ");
			this.pages = sc.nextInt();
			
			System.out.print("Enter price ");
			this.price = sc.nextFloat();
			
			System.out.print("Enter publisher ");
			this.publisher = sc.next();
			
			this.b[i] =  new Book(this.title, this.author, this.pages, this.price, this.publisher);
		}
		print();
		
	}
	
	@Override
	public String toString() 
	{
		return this.title+" "+this.author+" "+this.pages+" "+this.price+" "+this.publisher;
	}
	
	public String remove(String bName) 
	{
		for(int i=0; i<this.b.length; i++) 
		{
		    if (bName.equals(b[i].title)) 
			{
				System.out.println(b[i].title);
				return this.title+" "+this.author+" "+this.pages+" "+this.price+" "+this.publisher+" Removed";
			}
		}
		return "No Such Book exist";
	}	
	void print()
	{
		System.out.println(Arrays.toString(this.b));
	    Library.main(null);
	}
}

public class Library{
	
	public static void main(String [] args) 
	{
		Book obj = new Book();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1 to add book"+"\n"+"enter 2 to remove book");
		int n = sc.nextInt();
		
		if(n == 1)
		{
			System.out.print("enter the no of books to add ");
			int l = sc.nextInt();
			obj.add(l);
		} 
		else if(n == 2) 
		{
			System.out.println("enter the name of a book you want to remove from the below list ");
			System.out.println(Arrays.toString(Book.b));
			String bName = sc.next();
			System.out.println(obj.remove(bName));
			obj.remove(bName);
		}
	}
}