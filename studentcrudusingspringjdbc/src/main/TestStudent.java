package main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoImpl;
import data.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationcontext.xml");
		StudentDaoImpl stu=(StudentDaoImpl)ctx.getBean("sdao");
/*	Student stdnt=new Student();
	boolean result=stu.saveStudentByPst(stdnt);
	System.out.println(result);*/
int ch;
	do{	
System.out.println("===========Student CRUD Operations==============");
System.out.println("Menu\n1).To add a new Student\n2).To update studnet details\n3).To delete a student\n4).To display all students\n5)Enter 5 to quit");
System.out.println("Choose an option");
ch=sc.nextInt();
switch(ch)
{
case 1://to insert a record in the table
	  System.out.println("Enter student id");
	int id=sc.nextInt();
	System.out.println("Enter student name");
	String name=sc.next();
	System.out.println("Enter student age");
	int age=sc.nextInt();
	Student student=new Student();
	student.setId(id);
	student.setName(name);
	student.setAge(age);
//	stu.create(student);
	boolean result=stu.saveStudentByPst(student);
	if(result)
	System.out.println("Insertion Fail....... ");
	else
	System.out.println("Insertion Done.......");
	   break;

case 2://to update a record from the student table
	System.out.println("enter id to update");
	int uid=sc.nextInt();
	System.out.println("enter new name");
	String sname=sc.next();
	System.out.println("enter new age");
	int sage=sc.nextInt();
	Student student1=new Student();
	student1.setId(uid);
	student1.setName(sname);
	student1.setAge(sage);
	stu.update(student1);
	   break;

case 3: //to delete a record from the student table
    System.out.println("enter id to delete data");
	int sid=sc.nextInt();
	stu.delete(sid);
	   break;

case 4://for displaying student list
List<Student> students=stu.getStudents();
Iterator<Student> itr=students.iterator();
for(Student s:students)
{
	System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
}
stu.getStudents();
	   break;

case 5:  System.exit(0);
default:System.out.println("Enter a valid option");
 		break;
}
}while(ch!=0);

	}

}
