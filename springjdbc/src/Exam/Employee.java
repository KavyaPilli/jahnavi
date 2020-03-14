package Exam;

public class Employee {
	private String empid;
	private String ename;
	private String dept;
	private String desig;
	private String email;
	public Employee()
	{
		
	}
	public Employee(String empid, String ename, String dept, String desig, String email) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.dept = dept;
		this.desig = desig;
		this.email = email;
	}
	public Employee(String ename, String dept,String empid)
	{
		super();
		this.empid = empid;
		this.ename = ename;
		this.dept = dept;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
