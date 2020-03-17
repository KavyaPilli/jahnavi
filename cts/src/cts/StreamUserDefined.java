package cts;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class StreamUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p1=new Product(1001,"Samsung",50000);
Product p2=new Product(1002,"Sony",40000);
Product p3=new Product(1003,"Voltos",20000);
ArrayList<Product> products=new ArrayList<Product>();
products.add(p1);
products.add(p2);
products.add(p3);
List<Product> list=products.stream().filter(p->p.price>20000).map(p->p).collect(Collectors.toList());
	list.forEach(System.out::println);
	long cnt=products.stream().filter(p->p.price<=20000).count();
	System.out.println(cnt);
	}

}
