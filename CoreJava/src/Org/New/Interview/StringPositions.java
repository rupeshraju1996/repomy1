package Org.New.Interview;

public class StringPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(secondLargest(new int[] {52,65,96,36,99}));
		
		}
	static	int secondLargest(int[] input)	
		{
			 int firstLargest,secondLargest;
			if(input[0]>input[1])
			{
				secondLargest=input[1];
				firstLargest=input[0];
				
			}
			else {
				firstLargest=input[1];
				secondLargest=input[0];
			}
			for(int i = 2;i<input.length;i++)
				{
				if(input[i]>firstLargest)
				{
					secondLargest=firstLargest;
					firstLargest=input[i];
	
				}
				else if(firstLargest>input[i]&&secondLargest<input[i])
				{
				secondLargest=input[i];
				}
				}
				
		return secondLargest;

	}
}

