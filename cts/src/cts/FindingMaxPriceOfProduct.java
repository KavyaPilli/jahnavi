package cts;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindingMaxPriceOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Sony",40000);
		Product p3=new Product(1003,"Apple",60000);
		Product p4=new Product(1004,"Samsung",50000);
		Product p5=new Product(1005,"Sony",30000);
		Product p6=new Product(1006,"Apple",740000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		/*List<Product> list=products.stream()
				.filter(p->p.name=="Apple")
				.map(p->p).collect(Collectors.toList());
		Product p=products.stream()
				  .max((Product a,Product b)->a.price<b.price?-1:1)
				  .get();
		Product p=products.stream()
		           .filter(a->a.name.equals("Apple"))
		            .min((Product a,Product b)->a.price<b.price?-1:1)
				  .get(); */
		
		
		/*Product p=products.stream()
		           .filter(a->a.name.equals("Apple"))
		            .sorted((Product a,Product b)->a.price>(b.price))
				  .collect(Collectors.toList()); 
     	System.out.println(p);*/
	}



}
