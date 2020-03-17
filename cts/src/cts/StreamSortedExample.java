package cts;
import java.util.function.*;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class StreamSortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
ar.add(10);
ar.add(4);
ar.add(1);
ar.add(7);
ar.add(5);
ar.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
