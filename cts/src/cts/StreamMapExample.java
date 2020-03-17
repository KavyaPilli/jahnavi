package cts;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar=new ArrayList<Integer>();
Function<Integer,Integer> f=x->x*2;
ar.add(0);
ar.add(15);
ar.add(2);
ar.add(12);
ar.add(20);
ar.stream().map(x->x*2).forEach(System.out::println);
List list=ar.stream().map(x->x*3).collect(Collectors.toList());
System.out.println(list);
	}

}
