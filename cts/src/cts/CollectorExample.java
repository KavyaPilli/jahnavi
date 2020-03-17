package cts;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CollectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList =new ArrayList<Product>();
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Sony",40000);
		Product p3=new Product(1003,"Apple",60000);
		Product p4=new Product(1004,"Samsung",50000);
		Product p5=new Product(1005,"Sony",30000);
		Product p6=new Product(1006,"Apple",140000);
		ArrayList<Product> products=new ArrayList<Product>();
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		productsList.add(p4);
		productsList.add(p5);
		productsList.add(p6);
List<Double> productPriceList = productsList.stream().
                                map(x->x.price).
                                collect(Collectors.toList());
Set<Double>productPriceList1 =productsList.stream().
							  map(x->x.price).
							  collect(Collectors.toSet());
Double sumPrices=productsList.stream().	
                 collect(Collectors.summingDouble(x->x.price));
Integer sumId=productsList.stream()
.collect(Collectors.summingInt(x->x.id));
Double averages=productsList.stream()
.collect(Collectors.summingDouble(x->x.price));
System.out.println("productPriceList"+productPriceList);
System.out.println("productPriceList1 "+productPriceList1);
System.out.println("sumPrices :"+sumPrices);
System.out.println("SumId :"+sumId);
System.out.println("averages :"+averages);

	}

}
