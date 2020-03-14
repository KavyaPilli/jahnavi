package settermethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("setterbean.xml");
		Person q1=(Person)context.getBean("sm");

		q1.Display();  
	}

}
 