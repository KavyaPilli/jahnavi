package cts;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("Java");
		ar.add("testing");
		ar.add("oracle");
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println("Sorted order in asc"+ar);
		Collections.reverse(ar);
		System.out.println("reverse oder of given input"+ar);
		ArrayList ar1=new ArrayList();

//Collections.fill(ar,"Languiage");
//System.out.println("After applying fill"+ar);
boolean flag=Collections.disjoint(ar1, ar);
System.out.println(flag);
			}

}
