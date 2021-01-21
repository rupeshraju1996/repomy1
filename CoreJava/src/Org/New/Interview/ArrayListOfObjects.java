package Org.New.Interview;

	import java.util.*;
	
	class Student {  
		int rollno;
		String name;
		String place;
		public Student(int rollno,String name)
		{
			this.rollno=rollno;
			this.name=name;
	   }s
	}
	public class ArrayListOfObjects
	{
		public static void main(String[] args) {
			ArrayList <Student> alstudent =new ArrayList<>();
			Scanner scan=new Scanner(System.in);
			int rollno;
			String name;
			int iCount;
			for(iCount=0;iCount<3;iCount++)
			{
				System.out.println("enter your roll no");
				rollno=scan.nextInt();
				System.out.println("enter your name");
				name=scan.nextLine();
				alstudent.add(new Student(rollno,name));
			}
			scan.close();
				System.out.println("\n\n");
				Collections.sort(alstudent,new Comparator<Student>() 
				{
					public int compare(Student s1,Student s2)
					{
						return Integer.valueOf(s2.rollno).compareTo(s1.rollno);
					
					
					}

					
				});
				for(iCount =0;iCount<alstudent.size();iCount++)
				{
					System.out.println("name of Student is "+alstudent.get(iCount).rollno+"roll no of student is"+alstudent.get(iCount).name);

				
				}
	
			
			
		}
	}
	


