package Exam;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class EmployeeDaoImpl implements EmployeeDao{
	private JdbcTemplate jdbcTemplate;  
	 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{  
	   this.jdbcTemplate = jdbcTemplate;  
	}  
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		String sql="select * from employ";
		List<Employee> list=jdbcTemplate.query(sql, new RowMapper<Employee>(){

		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
		{

		Employee e=new Employee();
		e.setEmpid(rs.getString("empid"));
		e.setEname(rs.getString("ename"));
		e.setDept(rs.getString("dept"));
		e.setDesig(rs.getString("desig"));
		e.setEmail(rs.getString("email"));
		return e;

		}
		});
		return list;
		}
	}

