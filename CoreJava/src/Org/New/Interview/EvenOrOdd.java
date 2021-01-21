package Org.New.Interview;
import java.util.*;

public class EvenOrOdd {
	
public static int	checkEvenOROdd(int n)
{
	while(n!=0)
	{
	if(n%2==0)
		System.out.println("given number is even");
	else
		System.out.println("given number is odd");
	}
	return n;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		System.out.println("neter your number to check");
		scan.close();
		int result=checkEvenOROdd(n);
		System.out.println(result+"");
		
		

	}

}
