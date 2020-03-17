package cts;

import java.util.*;

class emp2 implements Comparable<emp2>
{
	String id;
	String name;
	emp2(String id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "emp2 [id=" + id + ",name=" + name + "]";
	}
	@Override
	public int compareTo(emp2 s)
	{
		if(name.compareTo(s.name)<0)
			return -1;
		else if(name.compareTo(s.name)>0)
			return 1;
		else
			return 0;
		
	}
}
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set hs=new TreeSet();
		hs.add("India");
		hs.add("china");
	//	hs.add(null);
		hs.add("japan");
		System.out.println(hs);
		TreeSet t=new TreeSet();

		t.add(new emp2("1","kavya"));
		t.add(new emp2("3","anuja"));

		t.add(new emp2("2","yamini"));
		t.forEach(System.out::println);
		//System.out.println(t);
	}

}
