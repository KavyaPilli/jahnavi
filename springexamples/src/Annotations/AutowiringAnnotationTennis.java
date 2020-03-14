package Annotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AutowiringAnnotationTennis {
private FortuneService fortuneservice;
@Autowired
public AutowiringAnnotationTennis(FortuneService thefortuneservice)
{
	fortuneservice=thefortuneservice;
}
public String getDailyWorkout()
{
	return "Practise ur backhand volley";
}
public String getDailyFortune()
{
	return fortuneservice.getFortune();
}
}
