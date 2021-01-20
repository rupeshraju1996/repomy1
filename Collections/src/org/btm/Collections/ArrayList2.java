package org.btm.Collections;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args)
	
	{
		ArrayList<String> al = new ArrayList<String>();
	       al.add("AB");
	       al.add("CD");
	       al.add("EF");
	       al.add("GH");
	       al.add("AB");
	       al.add("YZ");
	       System.out.println("ArrayList before remove:");
	       System.out.println(al);
	       //Removing 1st element
	       al.remove(0);
	       //Removing 3rd element from the remaining list
	       al.remove(2);
	       //Removing 4th element from the remaining list
	       al.remove(2);
	       System.out.println("ArrayList After remove:");
	       for(String var2: al){
	             System.out.println(var2);
	       }
	    }
	
}
