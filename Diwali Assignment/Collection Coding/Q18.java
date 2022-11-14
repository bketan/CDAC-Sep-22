import java.util.*;          //HashSet Comparsion Of TwoSets

class Q18 
{  
    public static void main(String[]args)  
    {  
        HashSet<String> l1 = new HashSet<String>();  
         
        l1.add("Redmi");
		l1.add("Motorola");
		l1.add("Apple");
				
        System.out.println("The values in the 1st set are: "+ l1);  
        System.out.println();  
        System.out.println("The size of the 1st set is: "+ l1.size());  
        
        HashSet<String> l2 = new HashSet<String>();  
        
        l2.add("Oppo");
		l2.add("Vivo");
		l2.add("Samsung");
		l2.add("Apple"); 
       
        System.out.println("The values in the 2nd set are: "+ l2);  
        System.out.println();  
        System.out.println("The size of the 2nd set is: "+ l2.size());  
       
        boolean result = l1.equals(l2);  
         
        if(result) 
			System.out.println("l1 and l2 are equal.");  
        else 
			System.out.println("l1 and l2 are not equal.");  
    }  
}  