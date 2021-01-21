package Org.New.Interview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		StringBuffer sb=new StringBuffer ("java");
		sb.reverse();
		System.out.println(sb);
		String str ="local";
		
		char [] strarry=str.toCharArray();
		for(int i=strarry.length-1;i>=0;i--)
		{
			System.out.print(strarry[i]);
		}

	}

}
