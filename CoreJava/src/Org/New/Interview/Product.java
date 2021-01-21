package Org.New.Interview;

import java.util.ArrayList;

public class Product {
	int id;
	String name;
	double price;

public Product(int i, String n,double p)
   {
	   this.id=i;
	   this.name=n;
	   this.price=p;
   }
public Product ()
{
	System.out.println("No Car Details Found ");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		   Product p2=new Product(11,"Benz",5555555.23);
		   Product p3=new Product(33,"RollRoyce",9665.365);
		   ArrayList <Product> lst=new  ArrayList<>();
		   lst.add(p);
		   lst.add(p2);
		   lst.add(p3);
		   System.out.println("here s the datils "+lst);
		   
		   

	}

}
