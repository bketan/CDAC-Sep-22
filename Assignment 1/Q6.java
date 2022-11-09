import java.util.*;  //to find leap year

class Q6{
public static void main(String args[]){

    Scanner sc =new Scanner(System.in);
	System.out.print("Enter the year in YYYY format ");
	short y = sc.nextShort();
	
	if (y%400==0)
	 System.out.println(y+" is a leap year");
	 
	 else if ( y%4==0 && y%100!=0)
	  System.out.println(y+" is a leap year");
	  
	  else
	   System.out.println(y+" is not a leap year");
}}