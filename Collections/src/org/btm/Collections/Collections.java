package org.btm.Collections;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Hi");
		al.add("Kennedy");
		al.add("Ram");
		System.out.println("Arraylist items is aadded before"+al);
		//creeating new arraylist 
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("texted here");
		al2.add("King dom");
		al2.addAll(al);
		System.out.println("After merging ArrayList"+al2);
		

	}

}
