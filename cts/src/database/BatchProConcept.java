
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProConcept {
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Drivers loaded");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
System.out.println("connection established");
con.setAutoCommit(false);
Statement st=con.createStatement();
st.addBatch("insert into student values(1005,'john')");
st.addBatch("delete from student where id=1005");
st.addBatch("update student set name='sunny' where id=102");
int res []=st.executeBatch();
for(int i=0;i<res.length;i++)
{
System.out.println("no of rows effeccted "+res[i]);
}
con.commit();
con.rollback();
con.close();
}
}