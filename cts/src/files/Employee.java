package files;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
public class Employee implements Serializable{
int id;
String name;
double sal;
	public Employee(int id,String name,double sal) {
		// TODO Auto-generated constructor stub
	super();
	this.id=id;
	this.name=name;
	this.sal=sal;
	}
	
public void printEmployee()
{
	System.out.println("Emp-id :" +id +"Emp-name :"+name+"Emp-sal:"+sal);
}


}
