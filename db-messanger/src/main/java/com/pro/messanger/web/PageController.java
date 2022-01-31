package com.pro.messanger.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/camera/insert")
	public String insertCamera() {
		return "/camera/insert";
	}
}
