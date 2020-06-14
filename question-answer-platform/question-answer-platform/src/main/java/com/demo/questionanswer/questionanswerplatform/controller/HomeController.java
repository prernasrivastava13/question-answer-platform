package com.demo.questionanswer.questionanswerplatform.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.questionanswer.questionanswerplatform.entity.Demo;
import com.demo.questionanswer.questionanswerplatform.service.DemoService;

@RestController
@RequestMapping("/test")
public class HomeController {

	private DemoService demoService;

	public HomeController(DemoService theDemoService) {
		demoService = theDemoService;
	}

	@RequestMapping("/testOne")
	public List<Demo> showHomePage() {
		return demoService.findAll();
	}

}
