package com.demo.questionanswer.questionanswerplatform.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.questionanswer.questionanswerplatform.entity.Demo;
import com.demo.questionanswer.questionanswerplatform.service.DemoService;

@RestController
@RequestMapping("/check")
public class DemoRestController {

	private DemoService demoService;

	public DemoRestController(DemoService theDemoService) {
		demoService = theDemoService;
	}

	@RequestMapping("/testOne")
	public List<Demo> showHomePage() {
		return demoService.findAll();
	}

}
