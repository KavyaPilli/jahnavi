package cts;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("kavya");
		ar.add("anujaa");
		ar.add("jessie");
		ar.add("veena");
		System.out.println(ar);
	    Collections.sort(ar);
		System.out.println(ar);
	}

}
