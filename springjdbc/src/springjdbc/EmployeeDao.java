package springjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate=jdbcTemplate;
}
public int saveEmployee(Employee e)
{
	String query="insert into employ values('"+e.getEmpid()+"','"+e.getEname()+"','"+e.getDept()+"','"+e.getDesig()+"','"+e.getEmail()+"')";
	return jdbcTemplate.update(query);
}
public int updateEmployee(Employee e)
{
	String query="update employ set ename='"+e.getEname()+"',dept='"+e.getDept()+"' where empid='"+e.getEmpid()+"'";
	return jdbcTemplate.update(query);
}
public int deleteEmployee(Employee e)
{
	String query="delete from employ where empid='"+e.getEmpid()+"' ";
	return jdbcTemplate.update(query);
}

}
