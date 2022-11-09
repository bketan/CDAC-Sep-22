import java.util.Scanner;   //Swapping of nos without 3rd variable

class Q4{
public static void main(String []args){

  Scanner sc=new Scanner(System.in);
  
  System.out.print("Enter first number ");
  int a=sc.nextInt();
  System.out.print("Enter second number ");
  int b=sc.nextInt();
  
    System.out.println();
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After Swapping");
	System.out.println();
	System.out.println("1st number is: "+a);
	System.out.println("2nd number is: "+b);
}}