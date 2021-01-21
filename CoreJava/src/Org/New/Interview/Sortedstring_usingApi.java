package Org.New.Interview;

import java.util.Arrays;

public class Sortedstring_usingApi {

	public static void main(String[] args) {
		String original="hello world";
		char [] chars=original.toCharArray();
		Arrays.sort(chars);
         String sorted =new String(chars);
         System.out.println(sorted);
	}

}
