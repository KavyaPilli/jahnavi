

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerifyUser
 */
@WebServlet("/VerifyUser")
public class VerifyUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerifyUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
		 response.setContentType("text/html");
	       PrintWriter pw=response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		int flag=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","root");
		Statement statement=connection.createStatement();
		String query="select * from users";
		ResultSet rs=statement.executeQuery(query);
		while(rs.next())
		{
			String uname = rs.getString(2);
			String password = rs.getString(3);
			if((name.equals("admin"))&&(pwd.equals("admin")))
			{
				flag=1;
				break;
			}
			else if((name.equals(uname))&&(pwd.equals(password)))
			{
		 	 flag=2;
			  break;
			}
		}
		if(flag==1)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Welcome");
			dispatcher.forward(request, response);
			
		      
		}
		else if(flag==2)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Associate");
			dispatcher.forward(request, response);
		}
		else
		{
			pw.println("<h3>UnAuthorised Users");
			pw.println("<br>Please Re-Login</h3>");
			
		}
		statement.close();
		connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);;
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
