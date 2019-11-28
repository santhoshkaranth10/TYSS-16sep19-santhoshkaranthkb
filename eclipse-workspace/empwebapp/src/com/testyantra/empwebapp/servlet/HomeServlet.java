package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.dto.EmployeeInfo;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
//		EmployeeInfo info=(EmployeeInfo)session.getAttribute("info");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
		dispatcher.forward(req, resp);
		//PrintWriter out=resp.getWriter();
		
//		out.println("<h1>WELCOME "+info.getName());
//		out.println("</h1>");
//		out.println("<a href='./search.html'>Search</a>");
//		out.println("<a href='./passwordchange.html'>ChangePassword</a>");
//		out.println("<a href='./logout'>Logout</a>");
//		
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("./login.jsp");
			dispatcher.forward(req, resp);
		}
	}//end of dogetmethod
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}//end of dopost
}//end of homeservlet
