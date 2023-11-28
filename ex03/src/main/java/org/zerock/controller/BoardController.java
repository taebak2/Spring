package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class BoardController {

	private BoardService service;
	
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/welcome")
	public String welcome2() {
		return "welcome";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		log.info("list");
		model.addAttribute("list",service.getList());
		return "board/list";
	}
}
