package Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import inheritance.Employee;

public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
HelloWorld helloworld=ctx.getBean(HelloWorld.class);
helloworld.setMsg("Hello");
helloworld.getMsg();
helloworld.Display();
Employee1 employee=ctx.getBean(Employee1.class);
employee.showEmp();
}

	}

