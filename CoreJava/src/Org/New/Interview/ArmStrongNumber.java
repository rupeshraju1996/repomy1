package Org.New.Interview;
import java.util.*;
public class ArmStrongNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number u want to check");

		ArmStrongNumber arrm=new ArmStrongNumber();
  System.out.println("Is ARmstrong Number"+arrm.checkArmstrong(156));
	}
  
  
 public boolean checkArmstrong (int n)
 {
 int sum=0;
  int number=n;
  while(n!=0)
  {
	  int r=n%10;
	  sum=sum+r*r*r;
	  n=n/10;
  }
  if(n==sum)
  {
	  return true;
  
  }
  return false;

 }

}
