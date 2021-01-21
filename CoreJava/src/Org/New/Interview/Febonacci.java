package Org.New.Interview;

public class Febonacci {

	public static void main(String[] args)
	{
		
		int n=10,t1=0,t2=1,i=1;
		while(i<=n)
		{
			System.out.println(""+t1+"");
			int sum=0;
			sum=t1+t2;
			t1=t2;
			t2=sum;
			i++;
		
		
		}
	}
}
    