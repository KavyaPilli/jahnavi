package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("inheritance.xml");
		Employee e=(Employee)context.getBean("MyEmployeeBean");
		e.Display();
	}

}
