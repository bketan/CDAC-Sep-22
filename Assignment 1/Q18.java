import java.util.Scanner;  //to find prime factors of the no

class Q18{
public static void main(String args[]){

  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number ");
  int a =sc.nextInt();
  
  for(int i =2;i<a;i++)
  {
	if (a%i==0)
	{ System.out.println("Prime factors of the given no are \n"+i);
      a=a/i;
    }
  }
     if (a>2)
     System.out.println(a);
}}