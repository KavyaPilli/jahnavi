package cts;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Sony",40000);
		Product p3=new Product(1003,"Voltos",20000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		List<Product> list=products.stream().
				           sorted((a,b)->a.name.compareTo(b.name)).
				           collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
