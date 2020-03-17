package cts;
import java.util.*;
import java.util.ArrayList;
public class MaxUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Sony",40000);
		Product p3=new Product(1003,"Voltos",20000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		Product p=products.stream()
				  .max((Product a,Product b)->a.price<b.price?-1:1)
		.get();
		
		System.out.println(p);
	}

}
