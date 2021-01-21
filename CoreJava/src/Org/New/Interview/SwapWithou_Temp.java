package Org.New.Interview;
public class SwapWithou_Temp 
{
	public static void main(String[] args) {
		
	
	int a=15;
	int c=35;
	a=a+c;
	c=a-c;
	a=a-c;
	System.out.println("After swap ");
	System.out.println(" A value "+a);
	System.out.println("c value "+c);
	//Second way
	a=a*c;
	c=a/c;
	a=a/c;
	System.out.println("After swap ");
	System.out.println(" A value "+a);
	System.out.println("c value "+c);
// with temp
	int temp=a;
	
	a=c;
	
	c= temp;
	System.out.println("After swap ");
	System.out.println(" A value "+a);
	System.out.println("c value "+c);

	
	
	}
}
