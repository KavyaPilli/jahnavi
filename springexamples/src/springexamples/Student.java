package springexamples;

public class Student {
String htno;
String name;
public Student()
{
	
System.out.println("Default cons");
}
Student(String htno)
{
	this.htno=htno;
}
Student(String htno,String name)
{
	this.htno=htno;
	this.name=name;
}
public String getHtno() {
	return htno;
}
public void setHtno(String htno) {
	this.htno = htno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void display()
{
	System.out.println(htno+" "+name);
}
public void startMethod()
{
	System.out.println("Student bean initialized");
}
public void destroyMethod()
{
	System.out.println("Student bean destroyed");
}
}
