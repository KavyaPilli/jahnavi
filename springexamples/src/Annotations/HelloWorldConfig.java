package Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class HelloWorldConfig
{
@Bean
public HelloWorld helloworld()
{
return new HelloWorld();

}
@Bean
public Employee1 getEmployee()
{
return new Employee1("111", "Kavya");
}

}

