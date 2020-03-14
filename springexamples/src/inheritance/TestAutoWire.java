package inheritance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
	    EmployeeBean eb=(EmployeeBean)context.getBean("emp");
	    System.out.println(eb.getFullName());
	    System.out.println(eb.getDepartmentBean().getName());
	}

}
