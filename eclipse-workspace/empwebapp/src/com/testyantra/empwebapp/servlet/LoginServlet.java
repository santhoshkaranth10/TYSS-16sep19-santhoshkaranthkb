package com.testyantra.empwebapp.servlet;

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
import com.testyantra.empwebapp.util.EmployeeDAOManger;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			int id=Integer.parseInt(req.getParameter("id"));
			String password=req.getParameter("password");
			String remberme=req.getParameter("remberme");
			if(remberme==null) {
				Cookie[] cookies=req.getCookies();
				if(cookies!=null) {
				for (Cookie cookie : cookies) {
					if(cookie.getName().equals("alwaysRember")) {
							cookie.setMaxAge(0);
							resp.addCookie(cookie);
					}
				}
				}
			}else {
				Cookie cookie=new Cookie("alwaysRember",+id+"");
				resp.addCookie(cookie);
			}
			
			EmployeeDAO dao=EmployeeDAOManger.getEmolyeeDao();
			EmployeeInfo info=dao.auth(id, password);
	
			if(info==null) {
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<h4 style='color:red'>Invalid Id Or Password</h4>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
				dispatcher.include(req, resp);
				out.println("</html>");
			}else {
				HttpSession session=req.getSession(true);
				session.setAttribute("info", info);
				RequestDispatcher dispatcher=req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
			}
	}
	
}
