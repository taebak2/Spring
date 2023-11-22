package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome2() {
		return "welcome";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/loginCheck", method = {RequestMethod.GET, RequestMethod.POST})
	public String loginCheck(String id) {
		if(id.equals("java")) {
			return "loginok";
		} else {
			return "loginfail";
		}
		
	}
	
}
