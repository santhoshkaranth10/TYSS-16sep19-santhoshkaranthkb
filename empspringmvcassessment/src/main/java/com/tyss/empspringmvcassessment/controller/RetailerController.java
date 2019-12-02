package com.tyss.empspringmvcassessment.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tyss.empspringmvcassessment.dto.Product;
import com.tyss.empspringmvcassessment.dto.RetailerBean;
import com.tyss.empspringmvcassessment.service.RetailerService;

@Controller
public class RetailerController {
	
	@Autowired
	private RetailerService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format,true);
		binder.registerCustomEditor(Date.class, editor);
	}
		
		@GetMapping("/login")
		public String loginPage() {
			return "login"; 
		}//end of login page
		
		@PostMapping("/login")
		public String login(int id,String password,
				HttpServletRequest request) {
			RetailerBean bean = service.login(id, password);
			if(bean==null) {
				request.setAttribute("msg", "invalidcredentials");
				return "login";
			}else {
				HttpSession session = request.getSession();
				session.setAttribute("bean", bean);
				return "home";
			}
			
		}//end of login()
		
		@GetMapping("/register")
		public String registerPage() {
			return "register"; 
		}
		
		@PostMapping("/register")
		public String register(RetailerBean bean,ModelMap map) {//here we have passed employeeBean because it contains all the details
			int check =service.register(bean);
			if(check>0) {
				map.addAttribute("msg", "you have registered and Id is "+check);
			}else {
				map.addAttribute("msg", "email is repeated");
			}
			return "login";
		}//end of register
		
		@GetMapping("/home")
		public String home(ModelMap map,
				@SessionAttribute(name="bean", required=false) RetailerBean bean) {//session attribute is compulsory otherwise it will throw error
	//to avoid the error we use required=false
			if(bean==null) {
				map.addAttribute("msg", "login first!!!");
				return "login";
				
			}else {
				return "home";
			}
		}//end of home()
		
		@PostMapping("/home")
		public String home() {
			return "home";
		}//end of home()
		
		@GetMapping("/search")
		public String search(@RequestParam("id")int id,
		            ModelMap map) {
			Product product= service.searchProduct(id);
			if(product==null) {
				map.addAttribute("msg", "data not found");
			}else {
				map.addAttribute("bean", product);
			}
			return "home";
			
		}
		
		@GetMapping("/changepassword")
		public String changePassword(HttpServletRequest request) {
			HttpSession session = request.getSession(false);
			if(session!=null) {
				return "changepassword";
			}
			else {
				return "login";
			}
		}//end of changepassword()
		
		@PostMapping("/changepassword")
		public String changePassword(String password,String confirmpassword,
				@SessionAttribute(name="bean")RetailerBean bean,
				ModelMap map) {
			if(password.equals(confirmpassword)) {
				service.changePassword(bean.getId(), password);
				map.addAttribute("msg", "password changed");
			}else {
				map.addAttribute("msg", "password not matching");
				
			}
			return "home";
		}
		

}
