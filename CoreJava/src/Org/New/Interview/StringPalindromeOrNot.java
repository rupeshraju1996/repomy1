package Org.New.Interview;
public class StringPalindromeOrNot {
	public static void main(String[] args)
	{
		String str="lal";
		String rev="";
		
		for(int i=str.length()-1;i>=0;--i)
		{
			rev=rev+str.charAt(i);
	
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindromre");
		}

	}

}
