package cts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
public static void main(String args[])
{
ArrayList<Integer> ar=new ArrayList();
Predicate<Integer> p1=x->x%5==0;
ar.add(0);
ar.add(5);
ar.add(10);
ar.add(12);
ar.add(18);
ar.add(20);
System.out.println(ar);
Stream s=ar.stream();
List<Integer> list=(List<Integer>) s.filter(p1).collect(Collectors.toList());
System.out.println(list);
//ar.stream().filter(x->x%5==0).forEach(System.out::println);
}
}
