package cts;

import java.util.ArrayList;

public class JoiningTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("kavya");
		ar.add("anujaa");
		ar.add("jessie");
		ar.add("veena");
		System.out.println(ar);
		ArrayList ar1=new ArrayList();
		ar1.add("yamini");
		ar1.add("vani");
		ar1.add("tanvi");
		ar1.add("gayatri");
		System.out.println(ar1);
		ar.addAll(ar1);
		System.out.println(ar);
	}

}
