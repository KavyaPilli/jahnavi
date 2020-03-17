package cts;
import java.util.function.*;
import java.util.*;
class TempEmp
{
String name;
double salary;
TempEmp(String name,double salary)
{
	super();
	this.name=name;
	this.salary=salary;
}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<TempEmp> l=new ArrayList<TempEmp>();
l.add(new TempEmp("Durga",1000));
l.add(new TempEmp("Sunny",2000));
l.add(new TempEmp("Bunny",3000));
l.add(new TempEmp("Chinny",4000));
BiConsumer<TempEmp,Double> c=(e,d)->e.salary=e.salary+d;
for(TempEmp e:l)
{
	c.accept(e,500.0);
}
for(TempEmp e:l){
	System.out.println("Employee Name: "+e.name);
	System.out.println("Employee Salary: "+e.salary);
	System.out.println();
}
	}

}
