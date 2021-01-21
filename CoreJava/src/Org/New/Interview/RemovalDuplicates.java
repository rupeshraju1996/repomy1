package Org.New.Interview;

import java.lang.reflect.Array;

public class RemovalDuplicates {
	
	public static int removalDuplicates(int array[],int n)
	{
	
		if(n==0||n==1)
			return n;
		int [] temp=new int [n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(array[i]!=array[i+1])
			{
				temp[j++]=array[i];
			}
		}
		temp[j++]=array[n-1];
		//change into original array by converting it by iiterating i with with j 
		for(int i=0;i<j;i++)
		{
			array[i]=temp[i];
		}
		return j;
		
				
		}
			public static void main(String[] args) {
				int[] array= {33,665,66,96,33,22,5,5};
			int	length=array.length;
				length=removalDuplicates(array,length);
				for(int i=0;i<length;i++)
				{
					System.out.println("removw eof duplicates"+array[i]);
				
			}
		}
	}



