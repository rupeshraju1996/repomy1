package Org.New.Interview;

public class SecondLargest {

	public static void main(String[] args) {
		
		int temp,size;
		int array[]= {22,36,96,12,54,36,69};
		size=array.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
			
		}
		System.out.println("second largest number in array is"+array[size-2]);

	}

}
	

