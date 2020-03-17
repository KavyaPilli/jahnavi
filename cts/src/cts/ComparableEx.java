package cts;
//import java.util.Comparable;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
class Stud2 implements Comparable<Stud2>
{
	String htno;
	String name;
	public Stud2(String htno,String name)
	{
		super();
		this.htno=htno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Stud [htno=" + htno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Stud2 s)
	{
		if(name.compareTo(s.name)<0)
			return -1;
		else if(name.compareTo(s.name)>0)
			return 1;
		else
			return 0;
		
	}
}

class Employee2
{
	String eid;
	String ename;
	public Employee2(String eid,String ename)
	{
		super();
		this.eid=eid;
		this.ename=ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
}
public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud2 s1=new Stud2("123","kavya");
		Stud2 s2=new Stud2("345","yamini");
		Stud2 s3=new Stud2("567","vaani");
		ArrayList<Stud2> ar=new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		Collections.sort(ar);
		System.out.println("sorted elements "+ar);
		Collections.reverse(ar);
		System.out.println("reverse sorted elements "+ar);
	}

}
