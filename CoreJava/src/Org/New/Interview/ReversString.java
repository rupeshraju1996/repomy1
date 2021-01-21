package Org.New.Interview;
import java.util.*;
public class ReversString {
	public static void main(String[] args) 
	{
		String str="rupesh";
      String reversestring="";
      for(int i=str.length()-1;i>=0;--i)
      {
    	  reversestring=reversestring+str.charAt(i);
      }
      System.out.println(reversestring);
	}

}
