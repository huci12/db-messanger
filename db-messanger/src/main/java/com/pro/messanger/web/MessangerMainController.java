package com.pro.messanger.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.messanger.service.MessangerService;

@RestController
public class MessangerMainController {
	
	@Autowired
	private MessangerService messangerService;
	
	@RequestMapping("/")
	public String index() {
		return "Hello";
	}
	@RequestMapping("/message")
	public List<Map<String,Object>> messageMain(HttpServletRequest req) {
		return messangerService.getMessageList();
	}
	
	
	
}
