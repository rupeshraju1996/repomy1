package Org.New.Interview;

public class ArrayLargestAndSmall {

	public static void main(String[] args) 
	{
	int	arr[] = new int[]{12,56,76,89,100,343,21,234};
	int largest=arr[0];
	int smallest=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>largest)
			largest=arr[i];
		else if(arr[i]<smallest)
		smallest=arr[i];
		
	}
	System.out.println("largest number:"+largest);
	System.out.println("smalllest number :"+smallest);
	}
}
	
	
