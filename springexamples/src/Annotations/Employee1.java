package Annotations;

public class Employee1 {
	String id;
	String name;

	public Employee1(String id, String name) {
	super();
	this.id = id;
	this.name = name;
	}
	public String getId() {
	return id;
	}
	public void setId(String id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public void showEmp() {
	// TODO Auto-generated method stub
	System.out.println("Id: "+id+"Name: "+name);
	}
}
