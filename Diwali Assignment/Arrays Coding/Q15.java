import java.util.*;      //missing number in an Array

class Q15
{
	public static void findMissing(int arr[], int n)
    {
        int i;
        int temp[] = new int[n + 1];
		
        for (i = 0; i <= n; i++) 
		{
            temp[i] = 0;
        }
 
        for (i = 0; i < n; i++) 
		{
            temp[arr[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= n; i++) 
		{
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
    
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,10};
        int n = arr.length;
 
		findMissing(arr, n);
    }
}