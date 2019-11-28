package com.testyantra.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dto.EmployeeInfo;
import com.testyantra.empwebapp.util.EmployeeDaoManager;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		String rememberMe = req.getParameter("rememberme");
		if(rememberMe == null) {
			//here we are getting all t cookies and deleting it
			Cookie[] cookies = req.getCookies();
			if(cookies!=null) {
				for (Cookie cookie : cookies) {
					if(cookie.getName().equals("alwaysRememeber")) {
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
					}
				}
			}else {
				Cookie cookie = new Cookie("alwaysRemember", id+"");//here the value is id
				resp.addCookie(cookie);//adding the cookie to the browser
			}

			EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
			EmployeeInfo info = dao.auth(id, password);

			if(info==null) {
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<h4 style='color:red'>Invalid id or password</h4>");
				out.println("</html>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
				dispatcher.include(req, resp);//include method will print the invalid credentials in the same servlet file 
				//else use dispatcher.forward
			}else {
				HttpSession session = req.getSession(true);
				session.setAttribute("info", info);//when we write this session will be created from login to logout  
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
			}

		}

	}
}
