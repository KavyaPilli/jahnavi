package dao;

import java.util.List;
import data.Student;
public interface IStudentDAO {
	/*create used to create record in the student table*/
public void create(Student student);
/* used to list down a record from the student table
	  corresponding to a passsed student id*/
public Student getStudent(int id);
/*getStudnet used to list down all records from student table*/
public List<Student> getStudents();
/*delete is used to delete a record from student table
 corrsponding to a passed student id*/

public void delete(int id);
/*update is used to update a record from student table
corrsponding to a passed student id*/
public void update(Student student);
public boolean saveStudentByPst(final Student student);
}
