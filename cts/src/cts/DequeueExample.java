package cts;
import java.util.*;

class Studnt {
	String name;
	int marks;
Studnt(String name,int marks)
{
	this.name=name;
	this.marks=marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", marks=" + marks + "]";
}

}
 public class DequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Studnt> d2= new PriorityQueue<Studnt>();
		Studnt ss1=new Studnt("Anil",65);
		Studnt ss2=new Studnt("bil",55);
		Studnt ss3=new Studnt("kil",45);
		d2.add(ss1);
	    d2.add(ss2);
		//d2.add(ss3);
		System.out.println(d2);
		System.out.println("After removal in student : "+d2.remove());
		/*	PriorityQueue d= new PriorityQueue();
d.add(10);
d.add(20);
d.add(4);
d.add(16);
System.out.println(d);
d.remove();
System.out.println("After Removal");
System.out.println(d);
d.add(19);
System.out.println(d);
d.remove();
System.out.println("After Removal");
System.out.println(d);*/
//PriorityQueue d1= new PriorityQueue();

/*d1.add("india");
d1.add("china");
d1.add("japan");
d1.add("america");
System.out.println(d1);
d1.remove();
System.out.println("After Removal");
System.out.println(d1);*/
	}

}
