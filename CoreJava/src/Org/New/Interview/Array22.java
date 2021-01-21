package Org.New.Interview;

public class Array22 {
	
	  


	public static void main(String[] args) {
     int []arr=new int[]{22,56,33,85,66};
     int largest=arr[0];
     
     for(int i=0;i<arr.length;i++)
     {
    	 if(largest<arr[i])
    	 {
    		 largest=arr[i];
    	 }
     }
     System.out.println("largest number is"+largest);
     
	}

}
