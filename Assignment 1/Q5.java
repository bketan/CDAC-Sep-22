import java.util.*;   //Positive or negative no

class Q5{

public static void main(String args[]){

     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the number ");
     int i = sc.nextInt();

     if (i < 0)
     System.out.println("number is negative");

     else
     System.out.println("Number is positive");
     
	 if (i==0)
     System.out.println("number is zero");
}
}