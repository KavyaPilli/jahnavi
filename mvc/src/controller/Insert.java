package controller;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmployDao;
import data.Employ;



/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.getWriter().append("Served at: ").append(request.getContextPath());
EmployDao empdao=new EmployDao();
empdao.getConnection();
Employ emp=new Employ();
String empid=request.getParameter("eid");
String ename=request.getParameter("ename");
String dept=request.getParameter("edept");
String desig=request.getParameter("edesig");
String email=request.getParameter("email");
emp.setDept(dept);
emp.setDesig(desig);
emp.setEmail(email);
emp.setEmpid(empid);
emp.setEname(ename);
int flag=empdao.insertEmploy(emp);
if(flag==1)
{	//HttpSession session=request.getSession();
	request.setAttribute("data",emp);
	RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/insertSuccess.jsp");
	rd.forward(request,response);
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("insetFailure.jsp");
	rd.forward(request,response);
}
		}
		catch(Exception e)
		{
			System.out.println(e);
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
