package Org.New.Interview;

public class LcmMethod {

	public static void main(String[] args) 
	{
	int	n1=160,n2=520;
	int lcm;
	lcm=(n1>n2)?n1:n2;
	while(true)
	{
		if(lcm%n1==0&&lcm%n2==0)
		{
			System.out.println("lcm of n1 and n2 is\n"+lcm);
		break;
		}
	
		++lcm;
	}
}
     
}