package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@RequestMapping("firstRequest")
	public String firstReq() {
		return "student-page";
	}
	
	@RequestMapping("secondpage")
	public String secondReq() {
		return "second-Spage";
	}
	
	
	//(If Invalid url ,return the error-page.jsp file).
	@RequestMapping("/**")
	public String error() {
		return "error-page";
	}

}
