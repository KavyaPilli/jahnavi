package cts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Stud1
{
	String htno;
	String name;
	public Stud1(String htno,String name)
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

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud1 s1=new Stud1("123","kavya");
		Stud1 s2=new Stud1("345","yamini");
		Stud1 s3=new Stud1("567","vaani");
		LinkedList ll=new LinkedList();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		System.out.println(ll);
		ll.forEach(System.out::println);

	}

}
