package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.service.MysqlBoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@AllArgsConstructor
public class HomeController {
	// 리스트 추가
	private MysqlBoardService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {

		return "welcome";
	}

	@GetMapping("/list")
	public String list(Model model) {
		log.info("list");
		model.addAttribute("list", service.getList());
		return "list";

	}
}
