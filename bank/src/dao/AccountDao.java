package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Accounts;




public class AccountDao {
	   private String jdbcURL;
	    private String jdbcUsername;
	    private String jdbcPassword;
	    private Connection jdbcConnection;
	    
	  public AccountDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
			super();
			this.jdbcURL = jdbcURL;
			this.jdbcUsername = jdbcUsername;
			this.jdbcPassword = jdbcPassword;
			
		}

	public void connect() throws SQLException {
	        if (jdbcConnection == null || jdbcConnection.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	               // com.mysql.cj.jdbc.Driver
	            } catch (ClassNotFoundException e) {
	                throw new SQLException(e);
	            }
	            jdbcConnection = DriverManager.getConnection(
	                                        jdbcURL, jdbcUsername, jdbcPassword);
	        }
	    }
	     
	    protected void disconnect() throws SQLException {
	        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
	            jdbcConnection.close();
	        }
	    }
	    public boolean Deposit(Accounts accounts) throws SQLException {
	        String sql = "update accounts set balance=(balance+?) where acno=?";
	        connect();
	        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
	        statement.setFloat(1, accounts.getBalance());
	        statement.setString(2, accounts.getAcno());
	       // statement.setString(2, accounts.getName());
	        //statement.setString(3, accounts.getAcktype());
	        boolean rowInserted = statement.executeUpdate() > 0;
	        statement.close();
	        disconnect();
	        return rowInserted;
	        
	    }
	    public boolean WithDraw(Accounts accounts) throws SQLException {
	        String sql = "update accounts set balance=(balance-?) where acno=?";
	         
	        connect();
	         
	        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
	        statement.setFloat(1, accounts.getBalance());
	        statement.setString(2, accounts.getAcno());
	         
	        boolean rowDeleted = statement.executeUpdate() > 0;
	        statement.close();
	        disconnect();
	        return rowDeleted;     
	    }
	    public void GetBalance(Accounts accounts) throws SQLException {
	    	connect();
	        String sql = "select balance from accounts where acno=?";
	        connect();
	         
	        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
	        statement.setString(1, accounts.getAcno());
	       
	        ResultSet res = statement.executeQuery();
	        
	        res.next();
	        System.out.println("Available balance : "+res.getFloat(1));
	        statement.close();
	        disconnect();
	        //return rowDeleted;  
	        
	        
	    }

}
