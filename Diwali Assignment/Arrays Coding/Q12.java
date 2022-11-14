class Q12    //rotate an array left and right by a given number
{
	void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n)
    {
		int temp, i;
		temp = arr[0];
        for (i = 0;i < n - 1;i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
	
	void rightRotate(int arr[], int d, int n)
    {
		for (int i = n; i > d; i--)      // Iterating till we want
			rightRotatebyOne(arr, n);    // Recursively calling
    }
 
    void rightRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
 
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    public static void main(String[] args)
    {
		Q12 rotate = new Q12();
		int arr[] = {1, 2, 3, 4, 5};
		
		for(int x :arr)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		rotate.leftRotate(arr,2,arr.length);
        rotate.printArray(arr, arr.length);
		System.out.println();
		
		rotate.rightRotate(arr,3,arr.length);
        rotate.printArray(arr, arr.length);
    }
}

