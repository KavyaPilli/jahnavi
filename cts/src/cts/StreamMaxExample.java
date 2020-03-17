package cts;
import java.util.ArrayList;
public class StreamMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar=new ArrayList<Integer>();
ar.add(10);
ar.add(2);
ar.add(14);
ar.add(6);
Integer x1=ar.stream().max((a,b)->a<b?-1:1).get();
System.out.println("Maximum is :"+x1);
Integer x2=ar.stream().min((a,b)->a<b?-1:1).get();
System.out.println("Minimum is :"+x2);
	}

}
