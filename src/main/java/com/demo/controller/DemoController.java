package com.demo.controller;

import com.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@Autowired
	DemoService demoService;

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		String str = demoService.sayHello("world");
//		return "hello";
		return str;
	}
}
