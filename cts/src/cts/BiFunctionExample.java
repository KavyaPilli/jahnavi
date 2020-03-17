package cts;
import java.util.function.*;
public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<Integer,Integer,Integer> bifadd=(a,b)->(a+b);
BiFunction<Integer,Integer,Integer> bifsub=(a,b)->(a-b);
BiFunction<Integer,Integer,Integer> bifmul=(a,b)->(a*b);
System.out.println(bifadd.apply(10,20));
System.out.println(bifsub.apply(10,4));
System.out.println(bifmul.apply(10,9));

	}

}
