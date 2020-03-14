package settermethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestPersonUsingSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Ref.xml");
		PersonUsingSetter pus=(PersonUsingSetter)context.getBean("sm1");

		pus.Display();  
	}

}
 