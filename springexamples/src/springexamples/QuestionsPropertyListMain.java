package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionsPropertyListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("QuestionPropertyListXml.xml");
QuestionsPropertyList qplm=(QuestionsPropertyList)context.getBean("qpl");
	qplm.Display();
	}

}
