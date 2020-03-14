package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import data.Student;

public class StudentDaoImpl implements IStudentDAO{
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
	this.jdbcTemplate=jdbcTemplate;	
	}
	@Override
	public void create(Student student) {
		// TODO Auto-generated method stub
		String query="insert into student values('"+student.getId()+"','"+student.getName()+"','"+student.getAge()+"')";
	//	jdbcTemplate.update(query);
		int result=jdbcTemplate.update(query);
		System.out.println(result+"Record Inserted");
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> getStudents() {
	String sql="select * from student";
	List<Student> lists=jdbcTemplate.query(sql,new RowMapper<Student>()
			{
		@Override
		public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
			Student stu=new Student();
			stu.setId(rs.getInt("id"));
			stu.setName(rs.getString("name"));
			stu.setAge(rs.getInt("age"));
			return stu;
		}
		
			});
	return lists;
	}
	
	
	
	/*
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student", new ResultSetExtractor <List<Student>>() {

		@Override
		public List<Student> extractData(ResultSet rs) throws SQLException,DataAccessException {
		List<Student> list=new ArrayList<Student>();
		while(rs.next())
		{
		Student s=new Student();
		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setAge(rs.getInt(3));
		}
		return list;
		}
		});
		}
*/
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String query="delete from student where id='"+id+"' ";
		int result=jdbcTemplate.update(query);
		System.out.println(result+" record deleted");
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		String query="update student set name='"+student.getName()+"',age='"+student.getAge()+"' where id='"+student.getId()+"'";
		int result=jdbcTemplate.update(query);
		System.out.println(result+" updated successfully");
	}
	@Override
	public boolean saveStudentByPst(final Student s) {
		// TODO Auto-generated method stub
		String query="insert into student values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
		public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException ,DataAccessException
		{
			ps.setInt(1,s.getId());
			ps.setString(2,s.getName());
			ps.setInt(3,s.getAge());
			return ps.execute();
		}
		});
	
	}

}
