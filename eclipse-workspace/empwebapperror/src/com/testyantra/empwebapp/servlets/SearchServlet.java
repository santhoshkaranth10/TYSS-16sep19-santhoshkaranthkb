package com.testyantra.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dto.EmployeeInfo;
import com.testyantra.empwebapp.util.EmployeeDaoManager;
@WebServlet("/search")
public class SearchServlet  extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);//checks if the session exists for a user or not it returns either null or existing session
		if(session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
			dispatcher.forward(req, resp);
			//next we need to search for the id for that we need to get the id first
		}
		int id = Integer.parseInt(req.getParameter("id"));
		//to call search employee method to search the id we have to create the object of employeeDao because search employee is in that class
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info = dao.searchEmployee(id);//here the return type is employeeinfo
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<a href='./home'>Home</a>");
		out.println("<a style='float:right' href='./logout'>Logout</a>");
		if(info!=null) {
		out.println("<table align='center'>");
		out.println("<tr>");
		out.println("<th>Id</th><th>Name</th><th>Email</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println(info.getId());
		out.println("</td>");
		out.println("<td>");
		out.println(info.getName());
		out.println("</td>");
		out.println("<td>");
		out.println(info.getEmail());
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		}
		else {
			out.println("no data found");
		}
		out.println("</body>");
		out.println("</html>");
		
		
		
		
	}
}
