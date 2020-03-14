package springexamples;

public class Person {
String name;
String age;
Address Address;
Person(String name,String age,Address Address)
{
	this.name=name;
	this.age=age;
	this.Address=Address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public void display()
{
	System.out.println(name+" "+age+" "+Address);
}
public void init()
{
	System.out.println(("person init is started "));
}


}
