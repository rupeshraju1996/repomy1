package Org.New.Interview;
import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter value u need check");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int i=2;
  int count =2;
	while(i<=n/2)
	{
		if(n/i==0)
		count++;
		if(count >2)
			break;
		i++;
	}
				System.out.println("Is a Prime number");
				sc.close();
			

	}

}
