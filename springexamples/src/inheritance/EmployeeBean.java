package inheritance;

public class EmployeeBean {
private String fullName;
private DepartmentBean departmentbean;
public EmployeeBean()
{
	
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public DepartmentBean getDepartmentBean() {
	return departmentbean;
}
public void setDepartmentBean(DepartmentBean departmentbean) {
	this.departmentbean = departmentbean;
}
public EmployeeBean(String fullName, DepartmentBean departmentbean) {
	super();
	this.fullName = fullName;
	this.departmentbean = departmentbean;
}

}
