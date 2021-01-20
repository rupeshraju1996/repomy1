package org.btm.Collections;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("logging on");
		list.add("logging in");
		for(String var:list)
		{
			System.out.println(var);
		}
		Object e1=new Object();
		list.remove(1);
		System.out.println("after removing in linked list "+e1+"result");
		for(String var2:list)
		{
			System.out.println(var2);
		}
		
		

	}

}
