package cts;
import java.util.ArrayList;
import java.util.function.Function;

public class Student {
	String name;
	int marks;
Student(String name,int marks)
{
	this.name=name;
	this.marks=marks;
}
@Override
public String toString() {
	return "Student [name=" + name + ", marks=" + marks + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student("kavya",80);
Student s2=new Student("vya",12);
Student s3=new Student("avya",50);
Student s4=new Student("kya",65);
Student s5=new Student("xya",48);
Student s6=new Student("ka",39);
ArrayList<Student> list=new ArrayList<Student>();
list.add(s1);
list.add(s2);
list.add(s3);
list.add(s4);
list.add(s5);
list.add(s6);
Function<Student,String> f1=fn->{
	if(fn.marks>=80)
	return "Grade A";
	else if((fn.marks>=70)&&(fn.marks<=79))
	return "Grade B";
	else if((fn.marks>=60)&&(fn.marks<=69))
	return "Grade c";
	else if((fn.marks>=50)&&(fn.marks<=59))
	return "Grade D";
	else if((fn.marks>=40)&&(fn.marks<=49))
	return "Grade E";
	else
	return "fail";
	
};


/*Consumer<Student> c=s->{
	System.out.println("Student name"+s.name);
	System.out.println("Student marks"+s.marks);
	System.out.println("Student Grade"+f.apply(s));
	
}*/

for(Student s:list)
{
	System.out.println("Student name "+s.name+" Student marks "+s.marks+" Student Grade "+f1.apply(s));
	
}
}
//System.out.println(f1.apply(s6));

	}


