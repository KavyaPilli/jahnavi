package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiringAnnotationTennis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContextTenni.xml");
		AutowiringAnnotationTennis tcoach=context.getBean(AutowiringAnnotationTennis.class);
		
		System.out.println(tcoach.getDailyWorkout());
		System.out.println(tcoach.getDailyFortune());
		context.close();
		
	}

}
