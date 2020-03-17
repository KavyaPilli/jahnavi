package cts;

import java.util.*;

public class SubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("kavya");
		ar.add("anujaa");
		ar.add("jessie");
		ar.add("veena");
		System.out.println(ar);
		List l2=ar.subList(1,4);
		System.out.println(l2);

	}

}
