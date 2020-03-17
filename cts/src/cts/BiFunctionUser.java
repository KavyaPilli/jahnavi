package cts;
import java.util.function.*;

public class BiFunctionUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<String,Integer,Student> bis=(name,marks)->new Student(name,marks);
Student st=bis.apply("Santoshi",98);
System.out.println(st);
	}

}
