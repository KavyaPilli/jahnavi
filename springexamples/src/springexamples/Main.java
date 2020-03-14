package springexamples;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");

	     HelloWorld1 a = (HelloWorld1) context.getBean("helloWorld");
	     a.getMessage();
	     context.registerShutdownHook();

	}

}
