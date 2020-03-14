package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("stxml.xml");
// ApplicationContext factory=new FileSystemXmlApplicationContext("stxml.xml");
		Student stu1=(Student)context.getBean("student");
		stu1.setHtno("1000");
		stu1.setName("Apps");
 stu1.display();


 Student stu2=(Student)context.getBean("student");

 stu2.display();
	}

}

