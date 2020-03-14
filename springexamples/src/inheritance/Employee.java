package inheritance;

public class Employee {
private String empid;
private String company;
private String name;
public Employee()
{
	
}
public Employee(String empid, String company, String name) {
	super();
	this.empid = empid;
	this.company = company;
	this.name = name;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
void Display()
{
	System.out.println(empid+" | "+company+" |    "+name);
}
}
