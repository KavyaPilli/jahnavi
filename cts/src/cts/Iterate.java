package cts;
import java.util.ArrayList;
import java.util.Iterator;
public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("kavya");
		ar.add("anujaa");
		ar.add("jessie");
		System.out.println(ar);
	Iterator itr=ar.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	}

}
