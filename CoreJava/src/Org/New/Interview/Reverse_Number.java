package Org.New.Interview;
import java.util.*;
public class Reverse_Number {
public static int checkReverse(int n)
{
	int sum=0;
	while(n>0)
	{
		
		int r=n%10;
		sum=sum*10+r;
		n=n/10;
		
		
		
		
	}
	return sum;
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       int n;
       Scanner scan =new Scanner(System.in);
       System.out.println("enter number u want to reverse");
       n=scan.nextInt();
       scan.close();
       int result=checkReverse(n);
       System.out.println("revresed number is :"+result);
       
	}

}
