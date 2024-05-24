package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
//	If there is single '/' then firstcall() method gets called and then returns (home-page.jsp file)
	@RequestMapping("/")
	public String firstCall() {
		return "home-page";  //<property name="prefix" value="/WEB-INF/jsp" />
//		                       <property name="suffix" value=".jsp" />
	}
	
	@RequestMapping("secondpage")
	public String  secondcall() {
		return "second-page";
	}
	
	@RequestMapping("thirdpage") 
	public String thirdcall() {
		return "form-page";
	}
	
	@RequestMapping("formFilled") 
	public String dataRecevied(HttpServletRequest req, Model m) {
		String name = req.getParameter("name");
		name = name.toUpperCase();
		m.addAttribute("nameReceived", name);
		return "show-data";
	}
}


