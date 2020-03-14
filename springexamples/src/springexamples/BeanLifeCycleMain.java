package springexamples;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");

		  BeanLifeCycle blc = (BeanLifeCycle) context.getBean("beanlifecycle");
		     blc.getMessage();
		     context.registerShutdownHook();

	}

}
