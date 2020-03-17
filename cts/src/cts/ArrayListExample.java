package cts;
import java.util.*;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
ar.add("Java");
ar.add("aesting");
ar.add("oracle");
System.out.println(ar);
ArrayList ar1=new ArrayList();
ar1.add("data science");
ar1.add("Python");
ar1.add("bigdata");
ar.addAll(ar1);
System.out.println(ar);
ar.add(ar1);//ar=ar+ar1;
System.out.println(ar);
ar1.add("Ruby");
System.out.println(ar1);

//if(ar1.contains(ar))
//System.out.println("Element found");
//else
	//System.out.println("Element not found");
//if(ar.containsAll(ar1))
//System.out.println("Element found");
//else
	//System.out.println("Element not found");
/*	ar1.removeAll(ar);
	System.out.println(ar1);
ar1.clear();
System.out.println(ar1);
*/
ListIterator itr=ar.listIterator();
while(itr.hasNext())
	System.out.println(itr.next());
while(itr.hasPrevious())
	System.out.println(itr.previous());
//System.out.println(itr.previous());


	}
	

}
