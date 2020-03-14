package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("xml.xml");
EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
/*Employee emp=new Employee();
emp.setEmpid("21");
emp.setEname("shiva");
emp.setDept("java");
emp.setDesig("business");
emp.setEmail("shiva@gmail.com");
int status=dao.saveEmployee(emp);
System.out.println(status);
System.out.println("Record inserted");*/
/*
Employee emp=new Employee();
emp.setEmpid("21");
int status=dao.deleteEmployee(emp);
System.out.println("deleted successfully");
*/
int st=dao.updateEmployee(new Employee("kavya","cse","110"));
System.out.println("Updated SuccessFully........"+st); 
	}

}
