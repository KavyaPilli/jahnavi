package cts;
//import java.util.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Stud
{
	String htno;
	String name;
	public Stud(String htno,String name)
	{
		super();
		this.htno=htno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Stud [htno=" + htno + ", name=" + name + "]";
	}

}

class Employee1
{
	String eid;
	String ename;
	public Employee1(String eid,String ename)
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
public class ArrayListUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stud s1=new Stud("123","kavya");
Stud s2=new Stud("345","yamini");
Stud s3=new Stud("567","vaani");
ArrayList<Stud> ar=new ArrayList();
ar.add(s1);
ar.add(s2);
ar.add(s3);
//System.out.println(ar);
/*Iterator itr=ar.iterator();
while(itr.hasNext())
System.out.println(itr.next());*/

/*for(Stud s:ar)
{
	System.out.println(s.htno+" "+s.name);
}
//ar.forEach(System.out::println);*/
//Employee1 e1=new Employee1("001","Ramana");
//ar.add(e1);
System.out.println(ar);


	}

}
