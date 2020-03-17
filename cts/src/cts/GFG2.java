package cts;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class GFG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream=IntStream.of(3,7,9,12,14);
		boolean answer1=stream.noneMatch(num->num%5==0);
		
List<Integer> list=Arrays.asList(13,5,7,9,11);
boolean answer2=list.stream().allMatch(n->n%3==0);
System.out.println(answer1);
System.out.println(answer2);
	}

}
