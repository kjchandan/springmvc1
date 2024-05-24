package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("trainer")
public class TeacherController {
	
	@RequestMapping("firstRequest") 
	public String firstReq() {
		return "trainer-page";
	}
	
	@RequestMapping("secondpage")
	public String secondReq() {
		return "second-Tpage";
	}

	
}
