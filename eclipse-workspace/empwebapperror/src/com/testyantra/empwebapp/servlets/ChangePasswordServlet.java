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

@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//we need to validate the session to change the password to see if the session exists or not
		HttpSession session = req.getSession(false);
		if(session!=null) {
			String pass = req.getParameter("password");
			String confirmpass = req.getParameter("confirmpassword");

			if(pass.equals(confirmpass)) {
				EmployeeInfo info =(EmployeeInfo)session.getAttribute("info");//we are taking the info from login servlet
				EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
				dao.changePassword(info.getId(), pass);
				RequestDispatcher dispatcher = req.getRequestDispatcher("./home");
			}else {

				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<h4>Password not matching");
				out.println("</html>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changepassword.html");
				dispatcher.include(req,resp);
			}
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
			dispatcher.forward(req, resp);
		}

	}
}
